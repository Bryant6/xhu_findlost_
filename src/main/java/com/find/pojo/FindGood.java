package com.find.pojo;

/**
 * @data 2019/7/20 14:14
 * @author wangyu
 *
 */

public class FindGood {

	//上传者的Id
	private String userId;
	//上传者名字
	private String userName;
	//物品大类
	private String goodsBigkind;
	//物品小类
	private String goodsSmallkind;
	//发布附言
	private String goodsPostscrit;
	//联系号码
	private String goodsContact;
	//联系方式
	private String goodsContact_way;
	//图片路径
	private String filePath;
	//发布种类
	private String publishCategory;
	
	public FindGood() {
		super();
	}

	public FindGood(String userId, String userName, String goodsBigkind, String goodsSmallkind, String goodsPostscrit,
			String goodsContact, String goodsContact_way, String filePath, String publishCategory) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.goodsBigkind = goodsBigkind;
		this.goodsSmallkind = goodsSmallkind;
		this.goodsPostscrit = goodsPostscrit;
		this.goodsContact = goodsContact;
		this.goodsContact_way = goodsContact_way;
		this.filePath = filePath;
		this.publishCategory = publishCategory;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGoodsBigkind() {
		return goodsBigkind;
	}

	public void setGoodsBigkind(String goodsBigkind) {
		this.goodsBigkind = goodsBigkind;
	}

	public String getGoodsSmallkind() {
		return goodsSmallkind;
	}

	public void setGoodsSmallkind(String goodsSmallkind) {
		this.goodsSmallkind = goodsSmallkind;
	}

	public String getGoodsPostscrit() {
		return goodsPostscrit;
	}

	public void setGoodsPostscrit(String goodsPostscrit) {
		this.goodsPostscrit = goodsPostscrit;
	}

	public String getGoodsContact() {
		return goodsContact;
	}

	public void setGoodsContact(String goodsContact) {
		this.goodsContact = goodsContact;
	}

	public String getGoodsContact_way() {
		return goodsContact_way;
	}

	public void setGoodsContact_way(String goodsContact_way) {
		this.goodsContact_way = goodsContact_way;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getPublishCategory() {
		return publishCategory;
	}

	public void setPublishCategory(String publishCategory) {
		this.publishCategory = publishCategory;
	}
	
	
}
