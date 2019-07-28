package com.find.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.find.mapper.FeedbackMapper;
import com.find.pojo.Feedback;
import com.find.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	private FeedbackMapper feedbackMapper;
	@Override
	public void insertUpload(Feedback feedback) {
		
		feedbackMapper.insertUpload(feedback);
	}

}
