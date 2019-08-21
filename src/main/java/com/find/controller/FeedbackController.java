package com.find.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	@ResponseBody
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
	@ResponseBody
	public String feedbackNoImg(HttpServletRequest req) throws Exception {
		Feedback feedback = new Feedback();
		//feedback.setSuggest(new String(req.getParameter("suggest").getBytes("ISO-8859-1"),"UTF-8"));
		feedback.setSuggest("suggest");
		feedback.setContact(req.getParameter("contact"));
		feedbackService.insertUpload(feedback);
		return "yes";
	}
}
