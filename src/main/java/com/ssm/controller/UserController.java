package com.ssm.controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.ssm.bean.User;
import com.ssm.service.UserService;
import com.ssm.util.ToJson;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static Logger log = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/getUser/{name}")
	@ResponseBody
	public List getUserByName(@PathVariable("name")String name, HttpServletRequest request){
	 	log.info("com.ssm.controller.UserController.getUserByName(String, HttpServletRequest)");
	 	List<User> userlist = userService.getUserByName(name);
		if(userlist.size() < 1){
			log.info("没找到：" + name);
			return null;
		}
	    return userlist;
	}
	
	@RequestMapping(value = "/getUser")	
	@ResponseBody
	public List getUserByrequest(HttpServletRequest request){
	 	log.info("com.ssm.controller.UserController.getUserByrequest(HttpServletRequest)");
	 	System.out.println("p1:" + request.getParameter("p1") + ",p2:" + request.getParameter("p2"));
	 	List<User> userlist = userService.getUserByRequest(request);
		if(userlist.size() < 1){
			log.info("没找到");
			return null;
		}
	    return userlist;
	}
	
	@RequestMapping(value = "/listUser")
	public String listUser(HttpSession session){
	 	log.info("com.ssm.controller.easyui.TestController.listUser(HttpSession)");
	 	List<User> userlist = userService.selectUser();
		if(userlist.size() < 1){
			log.info("无用户");
			return null;
		}
		String json = new ToJson().listToJson(userlist);
	 	session.setAttribute("user", json);
	    return "easyui_DataGrid";
	}
	
	@RequestMapping(value = "/listUserTest")
	public String listUserTes1() throws IOException{
	 	log.info("com.ssm.controller.easyui.TestController.listUserTest()");
	 	List<User> userlist = userService.selectUser();
	 	String json = new ToJson().listToJson(userlist);
	    return "panel";
	}
	
	@RequestMapping(value = "/listUserTest1")
	@ResponseBody
	public void listUserTest1(HttpServletResponse response) throws IOException{
	 	log.info("com.ssm.controller.easyui.TestController.listUserTest()");
	 	List<User> userlist = userService.selectUser();
	 	String json = new ToJson().listToJson(userlist);
	 	response.getWriter().print(json);
	    //return json;
	}
	
	@RequestMapping(value = "/listUserTest2")
	@ResponseBody
	public List<User> listUserTest2(){
	 	log.info("com.ssm.controller.easyui.TestController.listUserTest2()");
	 	List<User> userlist = userService.selectUser();
	    return userlist;
	}
	
	@RequestMapping("/user/{name}")
	@ResponseBody
	public String helloUser(@PathVariable("name")String name, HttpServletRequest request){
		log.info("测试 log配置");
		List<User> userlist = userService.getUserByName(name);
		String json = new ToJson().listToJson(userlist);
		return json;
	}
	
	@RequestMapping("/formload")
	@ResponseBody
	public JSONObject formload(){
		log.info("测试 log配置");
		JSONObject json = new JSONObject();
		json.put("name", "boy");
		json.put("email", "123@345.com");
		return json;
	}
	
	@RequestMapping("/deleteuser")
	@ResponseBody
	public int deleteuser(HttpServletRequest request) {
		log.info("测试 log配置");
		int num = userService.deleteUserByIds(request);
		return num;
	}
	
	@RequestMapping("/addeuser")
	@ResponseBody
	public int addeUser(User user) {
		log.info("测试 log配置");
		int num = userService.addUser(user);
		return num;
	}
	
	@RequestMapping("/updateuser")
	@ResponseBody
	public int updateUser(User user) {
		log.info("测试 log配置");
		int num = userService.updateUser(user);
		return num;
	}

}
