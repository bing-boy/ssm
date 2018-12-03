package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ssm.bean.User;
import com.ssm.dao.UserMapper;
import com.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	private static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

	@Autowired
	UserMapper userDao;
	
	@Override
	public List<User> getUserByName(String name) {
		return userDao.selectUserByName(name);
	}
	
	@Override
	public List<User> selectUser() {
		return userDao.selectUser();
	}

	@Override
	public User getUser(String userName, String userPwd) {
		return userDao.getUser(userName, userPwd);
	}
	
	@Override
	public List<User> selectUserByPage(int pageNumber, int pageSize) {
		pageNumber = (pageNumber-1) * pageSize;
		//pageSize = pageNumber + pageSize;
		return userDao.selectUserByPage(pageNumber, pageSize);
	}
	
	@Override
	public List<User> selectUserByOrder(HttpServletRequest request) {
		String pn = request.getParameter("page");
		String ps = request.getParameter("rows");
		int pageNumber = 1;
		int pageSize = 0;
		if(pn != null && !"".equals(pn)){
			pageNumber = Integer.parseInt(pn);
		}
		if(ps != null && !"".equals(ps)){
			pageSize = Integer.parseInt(ps);
		}
		log.info("pageNumber:" + pageNumber + ",pageSize:" + pageSize);
		String order = request.getParameter("order");
		String sort = request.getParameter("sort");
		int pageNumber1 = (pageNumber-1) * pageSize;
		//pageSize = pageNumber + pageSize;
		return userDao.selectUserByOrder(pageNumber1, pageSize , sort, order);
	}

	@Override
	public List<User> getUserByRequest(HttpServletRequest request) {
		String name = request.getParameter("name");
		if(name != null) {
			return userDao.selectUserByName(name);
		} else {
			return null;
		}
		
	}

	@Override
	public Integer count() {
		Integer count = userDao.count();
		return count;
	}
	
	@Override
	public Integer countByCondition(String sql) {
		int count = userDao.countByCondition(sql);
		return count;
	}
	
	@Override
	public JSONObject selectUserByAllCondition(HttpServletRequest request) {
		String username = request.getParameter("username");
		String starttime = request.getParameter("starttime");
		String endtime = request.getParameter("endtime");
		String sort = request.getParameter("sort");
		String order = request.getParameter("order");
		String page = request.getParameter("page");
		String rows = request.getParameter("rows");
		String sql = "select * from user where 1 = 1" ;
		String sqlcount = "select count(id) from user where 1=1";
		
		//获取pageNumber和PageSize
		int pageNumber = 1;
		int pageSize = 0;
		if(page != null && !"".equals(page)){
			pageNumber = Integer.parseInt(page);
		}
		if(rows != null && !"".equals(rows)){
			pageSize = Integer.parseInt(rows);
		}
		log.info("pageNumber:" + pageNumber + ",pageSize:" + pageSize);
		int pageNumber1 = (pageNumber-1) * pageSize;
		//pageSize = pageNumber1 + pageSize;
		
		//动态拼sql
		if(username != null && !"".equals(username)) {
			sql += " AND username like '%" + username + "%'";
			sqlcount += " AND username like '%" + username + "%'";
		}
		if(starttime != null && !"".equals(starttime)) {
			sql += " AND date >= '" + starttime + "'";
			sqlcount += " AND date >= '" + starttime + "'";
		}
		if(endtime != null && !"".equals(endtime)) {
			sql += " AND date <= '" + endtime + "'";
			sqlcount += " AND date <= '" + endtime + "'";
		}
		if(sort != null && !"".equals(sort)) {
			sql += " order by " + sort;
		}
		if(order != null && !"".equals(order)) {
			sql += " " + order;
		}
		sql += " limit " + pageNumber1 + "," + pageSize;
		List<User> userlist = userDao.selectUserByAllCondition(sql);
		
		int count = userDao.countByCondition(sqlcount);
		JSONObject object = new JSONObject();
		object.put("count", count);
		object.put("userlist", userlist);
		return object;
	}

	@Override
	public Integer deleteUserByIds(HttpServletRequest request) {
		String ids = request.getParameter("ids");
		String sql = "delete from user where id in (" + ids + ")";
		int num = userDao.deleteUserByIds(sql);
		return num;
	}

	@Override
	public Integer addUser(User user) {
		int num = userDao.addUser(user);
		return num;
	}
	
	@Override
	public Integer updateUser(User user) {
		int num = userDao.updateUser(user);
		return num;
	}

}
