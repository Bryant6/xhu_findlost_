package com.find.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.find.pojo.Feedback;
import com.find.service.FeedbackService;
import com.find.util.DfsUtil;
import com.find.util.FileUtil;

@Controller
@RequestMapping("/personal")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	
	private DfsUtil dfsUtil;
	private FileUtil fileUtil;
	
	@RequestMapping("/feedback")
	public String feedback(HttpServletRequest req,MultipartFile file){
		
		dfsUtil = new DfsUtil();
		fileUtil = new FileUtil();
		String local;
		try {
			local = fileUtil.upload(file, req);
			Feedback feedback = new Feedback(req.getParameter("suggest"),req.getParameter("contact"),dfsUtil.Upload(local));
			feedbackService.insertUpload(feedback);
			return "yes";
		} catch (Exception e) {
			return "no";
		}	
		
		
	}
	
	@RequestMapping("/feedbackNoImg")
	public String feedbackNoImg(HttpServletRequest req) {
		Feedback feedback = new Feedback();
		feedback.setSuggest(req.getParameter("suggest"));
		feedback.setContact(req.getParameter("contact"));
		feedbackService.insertUpload(feedback);
		return "yes";
	}
}
