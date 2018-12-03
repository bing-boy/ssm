package com.ssm.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssm.bean.User;

@Service
public interface UserMapper {
	 
	public void insertUser(User user);
	 
	public List<User> selectUser();
	
	public List<User> selectUserByName(String name);
	
	public User getUser(@Param(value = "userName") String userName, @Param(value = "userPwd") String userPwd);
	
	public List<User> selectUserByPage(@Param(value = "start") int start, @Param(value = "end") int end);
	
	public List<User> selectUserByOrder(@Param(value = "start") int start, @Param(value = "end") int end, @Param(value = "sort") String sort, @Param(value = "order") String order);
	
	public List<User> selectUserByAllCondition(@Param(value = "sql") String sql);
	
	public Integer count();
	
	public Integer countByCondition(@Param(value = "sql") String sql);
	
	public Integer deleteUserByIds(@Param(value = "sql") String sql);
	
	public Integer addUser(@Param(value = "user") User user);
	
	public Integer updateUser(@Param(value = "user") User user);
	
}
