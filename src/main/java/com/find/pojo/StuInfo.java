package com.find.pojo;

/**
 * 
 * @author wangyu
 * @data   2019-8-28 9:53 
 *
 */

public class StuInfo {

	//姓名
	private String stuName;
	//学号
	private String stuNum;
	//年级
	private String stuClass;
	//学院
	private String stuAcademy;
	//专业
	private String stuMajor;
	
	private String openid;
	//上传次数
	private Integer uploadTimes;
	
	public StuInfo() {
		super();
	}


	public StuInfo(String stuName, String stuNum, String stuClass, String stuAcademy, String stuMajor,String openid,Integer uploadTimes) {
		super();
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.stuClass = stuClass;
		this.stuAcademy = stuAcademy;
		this.stuMajor = stuMajor;
		this.openid = openid;
		this.uploadTimes = uploadTimes;
	}


	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public String getStuNum() {
		return stuNum;
	}


	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}


	public String getStuClass() {
		return stuClass;
	}


	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}


	public String getStuAcademy() {
		return stuAcademy;
	}


	public void setStuAcademy(String stuAcademy) {
		this.stuAcademy = stuAcademy;
	}


	public String getStuMajor() {
		return stuMajor;
	}


	public void setStuMajor(String stuMajor) {
		this.stuMajor = stuMajor;
	}


	public String getOpenid() {
		return openid;
	}


	public void setOpenid(String openid) {
		this.openid = openid;
	}


	public Integer getUploadTimes() {
		return uploadTimes;
	}


	public void setUploadTimes(Integer uploadTimes) {
		this.uploadTimes = uploadTimes;
	}
	
	
}
