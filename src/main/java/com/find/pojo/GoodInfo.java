package com.find.pojo;

/**
 * @data 2019/7/20 14:14
 * @author wangyu
 *
 */

public class GoodInfo {

	//物品Id
	private String goodsId;
	//物品小类
	private String goodsSmallkind;
	//发布附言
	private String goodsPostscrit;
	//发布时间
	private String goodsPubtime;	
	//联系号码
	private String goodsContact;
	//联系方式
	private String goodsContact_way;
	//图片路径
	private String goodsPhoto;
	//物品大类
	private String goodsBigkind;
	
	public GoodInfo() {
		super();
	}

	public GoodInfo(String goodsId, String goodsSmallkind, String goodsPostscrit, String goodsPubtime,
			String goodsContact, String goodsContact_way, String goodsPhoto, String goodsBigkind) {
		super();
		this.goodsId = goodsId;
		this.goodsSmallkind = goodsSmallkind;
		this.goodsPostscrit = goodsPostscrit;
		this.goodsPubtime = goodsPubtime;
		this.goodsContact = goodsContact;
		this.goodsContact_way = goodsContact_way;
		this.goodsPhoto = goodsPhoto;
		this.goodsBigkind = goodsBigkind;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
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

	public String getGoodsPubtime() {
		return goodsPubtime;
	}

	public void setGoodsPubtime(String goodsPubtime) {
		this.goodsPubtime = goodsPubtime;
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

	public String getGoodsPhoto() {
		return goodsPhoto;
	}

	public void setGoodsPhoto(String goodsPhoto) {
		this.goodsPhoto = goodsPhoto;
	}

	public String getGoodsBigkind() {
		return goodsBigkind;
	}

	public void setGoodsBigkind(String goodsBigkind) {
		this.goodsBigkind = goodsBigkind;
	}

	
	
}
