package com.ssm.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONArray;

@Service
public interface EasyUIService {
	
	public JSONArray getTreeDataFromSql(HttpServletRequest request);
}
