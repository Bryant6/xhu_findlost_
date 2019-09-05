package com.find.pojo;

/**
 * @data 2019/7/21 17:50
 * @author wangyu
 *
 */

public class Feedback {

	//ID 
	private String openid;
	//用户建议
	private String suggest;
	//用户联系方式
	private String contact;
	//图片地址
	private String filepath;
	
	
	public Feedback() {
		super();
	}


	public Feedback(String openid,String suggest, String contact, String filepath) {
		super();
		this.openid = openid;
		this.suggest = suggest;
		this.contact = contact;
		this.filepath = filepath;
	}


	
	
	public String getOpenid() {
		return openid;
	}


	public void setOpenid(String openid) {
		this.openid = openid;
	}


	public String getSuggest() {
		return suggest;
	}


	public void setSuggest(String suggest) {
		this.suggest = suggest;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getFilepath() {
		return filepath;
	}


	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
	
}
