package com.ssm.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Tree {

	private int id;
	private String text;
	private String state;
	private int fid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public Tree(int id, String text, String state, int fid) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
		this.fid = fid;
	}

	public Tree() {
	
	}

}
