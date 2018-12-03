package com.ssm.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ssm.bean.User;

public class test {
	public static void main(String[] args) {
		String json = null;
		ObjectMapper objectMapper = new ObjectMapper();
		/*Date date = new Date();
		SimpleDateFormat formate = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
		String date1 = formate.format(date);*/
		String date = DateUtil.getStringDate();
		System.out.println(date);
    	User user = new User(3, "bing", "12", "11@qq.com", "123", date);
    	List<User> list1 = new ArrayList<>();
    	list1.add(user);
    	try {
    		//jsonGenerator.writeObject(list1);
			json = objectMapper.writeValueAsString(list1);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	System.out.println(json);
	}
}
