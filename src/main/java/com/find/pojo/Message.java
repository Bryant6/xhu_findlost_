package com.find.pojo;

/**
 * @data 2019-9-3 10:19
 * @author wangyu 
 *
 */

public class Message {
	
	private String openid;
	
	private String msgTitle;
	
	private String msgTime;
	
	private String msgContent;

	public Message() {
		super();
	}

	public Message(String openid, String msgTitle, String msgTime, String msgContent) {
		super();
		this.openid = openid;
		this.msgTitle = msgTitle;
		this.msgTime = msgTime;
		this.msgContent = msgContent;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getMsgTitle() {
		return msgTitle;
	}

	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}

	public String getMsgTime() {
		return msgTime;
	}

	public void setMsgTime(String msgTime) {
		this.msgTime = msgTime;
	}

	public String getMsgContent() {
		return msgContent;
	}

	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}

	@Override
	public String toString() {
		return "Message [openid=" + openid + ", msgTitle=" + msgTitle + ", msgTime=" + msgTime + ", msgContent="
				+ msgContent + "]";
	}

	
}
