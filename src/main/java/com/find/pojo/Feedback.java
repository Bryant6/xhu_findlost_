package com.find.pojo;

/**
 * @data 2019/7/21 17:50
 * @author wangyu
 *
 */

public class Feedback {

	//用户建议
	private String suggest;
	//用户联系方式
	private String contact;
	//图片地址
	private String filepath;
	
	
	public Feedback() {
		super();
	}


	public Feedback(String suggest, String contact, String filepath) {
		super();
		this.suggest = suggest;
		this.contact = contact;
		this.filepath = filepath;
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
