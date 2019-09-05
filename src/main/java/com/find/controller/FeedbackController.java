package com.find.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.find.pojo.Feedback;
import com.find.pojo.GoodInfo;
import com.find.pojo.Message;
import com.find.pojo.StuInfo;
import com.find.service.FeedbackService;
import com.find.service.HistoryService;
import com.find.service.MessageService;
import com.find.service.StuInfoService;
import com.find.util.DfsUtil;
import com.find.util.FileUtil;

@Controller
@RequestMapping("/personal")
public class FeedbackController {

	@Autowired
	private FeedbackService feedbackService;
	@Autowired
	private StuInfoService stuInfoService;
	@Autowired
	private HistoryService historyService;
	
	@Autowired
	private MessageService messageMapper;
	
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
			Feedback feedback = new Feedback(req.getParameter("openid"),req.getParameter("suggest"),req.getParameter("contact"),dfsUtil.Upload(local));
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
		feedback.setOpenid(req.getParameter("openid"));
		feedback.setSuggest(req.getParameter("suggest"));
		feedback.setContact(req.getParameter("contact"));
		feedbackService.insertUpload(feedback);
		return "yes";
	}
	
	
	@PostMapping("/stuInfo")
	@ResponseBody
	public String stuInfo(HttpServletRequest req) {
		try {
			Integer uploadTimes = Integer.parseInt(req.getParameter("uploadTimes"));
			System.out.println("上传次数"+ uploadTimes);
			if(uploadTimes == 1) {
				System.out.println("insertStuInfo"+ req.getParameter("stuClass"));
				String id = UUID.randomUUID().toString();
				String openid=id.replace("-", "");
				StuInfo stuInfo = new StuInfo(req.getParameter("stuName"),req.getParameter("stuNum"),req.getParameter("stuClass"),req.getParameter("stuAcademy"),req.getParameter("stuMajor"),openid,uploadTimes);
				stuInfoService.insertStuInfo(stuInfo);
				return "yes";
			}else {
				String openid = req.getParameter("openid");
				System.out.println("update" + openid);
				
				stuInfoService.updateStuInfo(req.getParameter("stuName"),req.getParameter("stuNum"),req.getParameter("stuClass"),req.getParameter("stuAcademy"),req.getParameter("stuMajor"),openid,req.getParameter("uploadTimes"),openid);
				return "yes";
			}
		} catch (Exception e) {
			return "no";
		}
	}
	
	@PostMapping("/history")
	@ResponseBody
	public List<GoodInfo> history(HttpServletRequest req) throws Exception{
		String openid1 = req.getParameter("openid");
		String openid2 = req.getParameter("openid");
		System.out.println(openid1);
		return historyService.findHistoryById(openid1,openid2);
	}
	
	
	@PostMapping("/msg")
	@ResponseBody
	public List<Message> message(HttpServletRequest req){
		
		String openid = req.getParameter("openid");
		System.out.println("msg:"+openid);
		System.out.println(messageMapper.selectById(openid));
		return messageMapper.selectById(openid);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
