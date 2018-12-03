package com.ssm.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.ssm.bean.User;

@Service
public interface UserService {
	List<User> getUserByName(String name);
	
	List<User> selectUser();//查找所有的user
	
	User getUser(String userName, String userPwd); //根据用户名，密码查找user
	
	List<User> selectUserByPage(int pageNumber, int pageSize);
	
	List<User> selectUserByOrder(HttpServletRequest request);
	
	JSONObject selectUserByAllCondition(HttpServletRequest request);
	
	List<User> getUserByRequest(HttpServletRequest request);
	
	Integer count();
	
	Integer countByCondition(String sql);
	
	Integer deleteUserByIds(HttpServletRequest request);
	
	Integer addUser(User user);
	
	Integer updateUser(User user);
}
