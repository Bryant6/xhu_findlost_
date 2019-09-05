package com.find.service;

import java.util.List;

import com.find.pojo.Message;

public interface MessageService {
	
	public List<Message> selectById(String openid);

}
