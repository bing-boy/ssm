package com.ssm.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ssm.bean.Tree;
import com.ssm.dao.TreeMapper;
import com.ssm.service.EasyUIService;

@Service
public class EasyUIServiceImpl implements EasyUIService {

	@Autowired
	TreeMapper treeDao;
	
	@Override
	public JSONArray getTreeDataFromSql(HttpServletRequest request) {
		String sid = request.getParameter("id");
		int id;
		if(request.getParameter("id") == null || "".equals(sid)) {
			id = 0;
		} else {
			id = Integer.parseInt(sid);
		}
		System.out.println("id=" + id);
		List<Tree> treeData = treeDao.getTreeById(id);
		
		JSONArray array = new JSONArray();
		for (Tree tree : treeData) {
			JSONObject object = new JSONObject();
			object.put("id", tree.getId());
			object.put("text", tree.getText());
			object.put("state", tree.getState());
			object.put("fid", tree.getFid());
			array.add(object);
		}
		return array;
	}

}
