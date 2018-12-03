package com.ssm.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.bean.User;
import com.ssm.service.EasyUIService;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/hello")
public class EasyuiController {

	private static Logger log = LoggerFactory.getLogger(EasyuiController.class);

	@Autowired
	UserService userService;
	
	@Autowired
	EasyUIService easyUIService;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		log.info("测试 log配置");
		return "index";
	}

	@RequestMapping("/user/{name}")
	@ResponseBody
	public String helloUser(@PathVariable("name") String name) {
		log.info("测试 log配置");
		List<User> userList = userService.getUserByName(name);
		if (userList.size() < 1) {
			log.info("没找到name= " + name + " 的人");
			return null;
		}
		return "hello " + userList.get(0).getUserName();
	}

	@RequestMapping("/panel")
	public String panel() {
		log.info("测试 log配置");
		return "panel";
	}

	@RequestMapping("/pagination")
	public String pagination() {
		log.info("测试 log配置");
		return "pagination";
	}
	
	@RequestMapping("/combo")
	public String combo() {
		log.info("测试 log配置");
		return "combo";
	}
	
	@RequestMapping("/combobox")
	public String combobox() {
		log.info("测试 log配置");
		return "combobox";
	}
	
	@RequestMapping("/combotree")
	public String combotree() {
		log.info("测试 log配置");
		return "combotree";
	}
	
	@RequestMapping("/combogrid")
	public String combogrid() {
		log.info("测试 log配置");
		return "combogrid";
	}
	
	@RequestMapping("/datagrid")
	public String datagrid() {
		log.info("测试 log配置");
		return "datagrid";
	}
	
	@RequestMapping("/deletedatagrid")
	@ResponseBody
	public String deleteDatagrid(HttpServletRequest request) {
		
		log.info("测试 log配置");
		int num = userService.deleteUserByIds(request);
		//return num;
		return String.valueOf(num);
	}
	
	@RequestMapping("/adddatagrid")
	@ResponseBody
	public int addDatagrid(User user) {
		log.info("addDatagrid测试 log配置");
		int num = userService.addUser(user);
		return num;
	}
	
	@RequestMapping("/updatedatagrid")
	@ResponseBody
	public int updateDatagrid(User user) {
		log.info("测试 log配置");
		int num = userService.updateUser(user);
		return num;
	}
	
	@RequestMapping("/textbox")
	public String textbox() {
		log.info("测试 log配置");
		return "textbox";
	}
	
	@RequestMapping("/form")
	public String form() {
		log.info("测试 log配置");
		return "form";
	}
	
	@RequestMapping("/tree")
	public String tree() {
		log.info("测试 log配置");
		return "tree";
	}
	
	
	@RequestMapping("/comboboxjson")
	@ResponseBody
	public JSONArray comboboxjson(HttpServletRequest request) {
		log.info("测试 log配置-comboboxjson");
		/*JSONArray array = new JSONArray();
		JSONObject object = null;
		
		object = new JSONObject();
		object.put("id", "apple");
		object.put("text", "苹果");
		object.put("selected", true);
		array.add(object);

		object = new JSONObject();
		object.put("id", "banana");
		object.put("text", "香蕉");
		array.add(object);

		object = new JSONObject();
		object.put("id", "orange");
		object.put("text", "橘子");
		array.add(object);

		return array;*/
		
		String item = request.getParameter("q");
		Map<String, String> map = new HashMap<>();
		map.put("apple", "苹果");
		map.put("apple1", "苹果1");
		map.put("potato","西红柿");
		map.put("banana", "香蕉");
		map.put("orange","橘子");
		
		JSONArray array = new JSONArray();
		
		
		if(item != null) {
			for (Map.Entry<String, String> entry : map.entrySet()) {
				JSONObject object = new JSONObject();
				if(entry.getValue().contains(item)) {
					object.put("id",entry.getKey());
					object.put("text", entry.getValue());
					object.put("type", "potato".equals(entry.getKey())?"蔬菜":"水果");
					array.add(object);
				}
			}
		}
		else {
			JSONObject object = null;
			
			object = new JSONObject();
			object.put("id", "apple");
			object.put("text", "苹果");
			object.put("type", "水果");
			array.add(object);
			
			object = new JSONObject();
			object.put("id", "apple1");
			object.put("text", "苹果1");
			object.put("type", "水果");
			array.add(object);
			
			object = new JSONObject();
			object.put("id", "potato");
			object.put("text", "西红柿");
			object.put("type", "蔬菜");
			array.add(object);
			
			object = new JSONObject();
			object.put("id", "banana");
			object.put("text", "香蕉");
			object.put("type", "水果");
			array.add(object);

			object = new JSONObject();
			object.put("id", "orange");
			object.put("text", "橘子");
			object.put("type", "水果");
			array.add(object);
			
		}
		System.out.println(array.toJSONString());
		return array;
		
		
	}

	@RequestMapping("/listUserTest")
	@ResponseBody
	public List<User> listUserTest() {
		log.info("com.ssm.controller.easyui.HelloController.listUserTest()");
		List<User> userlist = userService.selectUser();
		return userlist;
	}
	
	@RequestMapping("/listUserTest1")
	@ResponseBody
	public List<User> listUserTest1(int pageNumber, int pageSize) {
		log.info("com.ssm.controller.easyui.HelloController.listUserTest()");
		log.info("pageNumber:" + pageNumber + ",pageSize:" + pageSize);
		List<User> userlist = userService.selectUserByPage(pageNumber, pageSize);
		return userlist;
	}

	@RequestMapping("/listUserTest2")
	@ResponseBody
	public JSONObject listUserTest2(HttpServletRequest request) {
		log.info("com.ssm.controller.EasyuiController.listUserTest1(HttpServletRequest request)");
		
		List<User> userlist = userService.selectUserByOrder(request);
		int count = userService.count();
	
		JSONObject data = new JSONObject();
		JSONArray array = new JSONArray();
		data.put("total", count);
		for (User user : userlist) {
			JSONObject ob = new JSONObject();
			ob.put("id", user.getId());  //这里前面的大小写不是与实体bean（User）对应，而是与jsp(或者js)中的字段对应
			ob.put("userName", user.getUserName());
			ob.put("userPwd", user.getUserPwd());
			ob.put("userAddress", user.getUserAddress());
			ob.put("userMail", user.getUserMail());
			ob.put("date", user.getDate());
			array.add(ob);
		}
		data.put("rows", array);
		return data;
	}
	
	@RequestMapping(value = "/listUserTest3")
	@ResponseBody
	public JSONObject listUserTest3(HttpServletRequest request){
	 	log.info("com.ssm.controller.easyui.TestController.listUserTest3()");
	 	
	 	JSONObject data = new JSONObject();
		JSONArray array = new JSONArray();
		
	 	JSONObject userdata = userService.selectUserByAllCondition(request);
	 	
	 	int total = (int)userdata.get("count");
	 	List<User> userlist = (List<User>)userdata.get("userlist");
	 	
	 	data.put("total", total);
	 	for (User user : userlist) {
			JSONObject ob = new JSONObject();
			ob.put("id", user.getId());  //这里前面的大小写不是与实体bean（User）对应，而是与jsp(或者js)中的字段对应
			ob.put("userName", user.getUserName());
			ob.put("userPwd", user.getUserPwd());
			ob.put("userAddress", user.getUserAddress());
			ob.put("userMail", user.getUserMail());
			ob.put("date", user.getDate());
			array.add(ob);
		}
		data.put("rows", array);
		
	    return data;
	}
	
	@RequestMapping("/treedata")
	@ResponseBody
	public JSON treedata(HttpServletRequest request) {
		log.info("com.ssm.controller.easyui.HelloController.tree()");
		JSONArray array = new JSONArray();
		System.out.println(request.getParameter("name"));
		
		JSONObject object1 = new JSONObject();
		//object1.put("", value)
		String s = "[{\r\n" + 
				"    \"id\":1,\r\n" + 
				"    \"text\":\"Folder1\",\r\n" + 
				"    \"iconCls\":\"icon-save\",\r\n" + 
				"    \"children\":[\r\n" + 
				"		{\r\n" + 
				"			\"text\":\"File1\",\r\n" + 
				"			\"checked\":true\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"text\":\"Books\",\r\n" + 
				"			\"state\":\"open\",\r\n" + 
				"			\"attributes\":{\r\n" + 
				"				\"url\":\"/demo/book/abc\",\r\n" + 
				"				\"price\":100\r\n" + 
				"			},\r\n" + 
				"			\"children\":[\r\n" + 
				"				{\r\n" + 
				"					\"text\":\"PhotoShop\",\r\n" + 
				"					\"checked\":true\r\n" + 
				"				},\r\n" + 
				"				{\r\n" + 
				"					\"id\": 8,\r\n" + 
				"					\"text\":\"Sub Bookds\",\r\n" + 
				"				}\r\n" + 
				"			]\r\n" + 
				"		}\r\n" + 
				"	]\r\n" + 
				"},\r\n" + 
				"{\r\n" + 
				"    \"text\":\"Languages\",\r\n" + 
				"    \"state\":\"closed\",\r\n" + 
				"    \"children\":[\r\n" + 
				"		{\r\n" + 
				"			\"text\":\"Java\"\r\n" + 
				"		},\r\n" + 
				"		{\r\n" + 
				"			\"text\":\"C#\"\r\n" + 
				"		}\r\n" + 
				"	]\r\n" + 
				"}]";
		JSON json = (JSON) JSON.parse(s);
		return json;  //这里要返回JSON数据才能被easyui的tree对象接受，否则返回String格式，没效果
	}
	
	@RequestMapping("/treedata1")
	@ResponseBody
	public JSONArray getTreeDataFromSql(HttpServletRequest request) {
		log.info("com.ssm.controller.EasyuiController.getTreeDataFromSql(HttpServletRequest)");
		JSONArray treeDataFromSql = easyUIService.getTreeDataFromSql(request);
		System.out.println(treeDataFromSql);
		return treeDataFromSql;
	}

}
