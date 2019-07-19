package com.find.pojo;

/**
 * @author:wang
 * @data:2019/7/17 /10:35
 */

public class FindOwner {

    //ID
    private String goodsId;
    //名称
    private String goodsName;
    //附言
    private String goodsPostscrpt;
    //发布时间
    private String goodsPubtime;
    //联系方式
    private String goodsContact;
    //照片地址
    private String goodsPhoto;
	public String getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsPostscrpt() {
		return goodsPostscrpt;
	}
	public void setGoodsPostscrpt(String goodsPostscrpt) {
		this.goodsPostscrpt = goodsPostscrpt;
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
	public String getGoodsPhoto() {
		return goodsPhoto;
	}
	public void setGoodsPhoto(String goodsPhoto) {
		this.goodsPhoto = goodsPhoto;
	}
	@Override
	public String toString() {
		return "FindOwner [goodsId=" + goodsId + ", goodsName=" + goodsName + ", goodsPostscrpt=" + goodsPostscrpt
				+ ", goodsPubtime=" + goodsPubtime + ", goodsContact=" + goodsContact + ", goodsPhoto=" + goodsPhoto
				+ "]";
	}
    
    


}
