package com.find.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.csource.common.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.find.pojo.FindGood;
import com.find.service.FindGoodService;
import com.find.util.DfsUtil;
import com.find.util.FileUtil;

@Controller
@RequestMapping("/publish")
public class PublishController {

	@Autowired
	private FindGoodService findGoodService;
	
	private DfsUtil dfsUtil;
	private FileUtil fileUtil;
	
	@RequestMapping("/findGoodsSubmit")
	@ResponseBody
	public String submitData(HttpServletRequest request,MultipartFile file) throws Exception {
		
		dfsUtil = new DfsUtil();
		fileUtil = new FileUtil();
		String local = fileUtil.upload(file, request);		
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String goodsBigkind = request.getParameter("goodsBigkind");
		String goodsSmallkind = request.getParameter("goodsSmallkind");
		String goodsPostscrit = request.getParameter("goodsPostscrit");
	    String goodsContact = request.getParameter("goodsContact");
		String goodsContact_way = request.getParameter("goodsContact_way");
		String filePath = dfsUtil.Upload(local);
		String publishCategory = request.getParameter("publishCategory");
		
		FindGood findGood = new FindGood(userId, userName, goodsBigkind, goodsSmallkind, goodsPostscrit, goodsContact, goodsContact_way, filePath, publishCategory);
		findGoodService.insertSubmit(findGood);
		
		return "yes ";
	}
	
}
