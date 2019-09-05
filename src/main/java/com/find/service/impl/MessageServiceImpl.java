package com.find.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.MessageMapper;
import com.find.pojo.Message;
import com.find.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService {
	
	@Autowired
	private MessageMapper messageMapper;

	@Override
	public List<Message> selectById(String openid) {
		// TODO Auto-generated method stub
		return messageMapper.selectById(openid);
	}

}
