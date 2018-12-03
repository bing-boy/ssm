package com.ssm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.ssm.bean.Tree;

@Service
public interface TreeMapper {
	 
	public List<Tree> getTreeById(@Param(value = "id") int id);
}
