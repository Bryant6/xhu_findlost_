package com.find.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.find.pojo.GoodInfo;
import com.find.service.PublishService;
import com.find.util.DfsUtil;
import com.find.util.FileUtil;

@Controller
@RequestMapping("/publish")
public class PublishController {

	@Autowired
	private PublishService publishService;
	
	private DfsUtil dfsUtil;
	private FileUtil fileUtil;
	
	@PostMapping("/findGoodsSubmit")
	@ResponseBody
	public String submitData(HttpServletRequest request,MultipartFile file) throws Exception {
		
		dfsUtil = new DfsUtil();
		fileUtil = new FileUtil();
		
			String local = fileUtil.upload(file, request);

			String id = UUID.randomUUID().toString();
			String goodsId=id.replace("-", "");
			String goodsSmallkind = request.getParameter("goodsSmallkind");
			String goodsPostscript = request.getParameter("goodsPostscript");

			SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
			String goodsPubtime = sdf.format(new Date());
		    String goodsContact = request.getParameter("goodsContact");
			String goodsContactWay = request.getParameter("goodsContactWay");

			System.out.println(local);
			String goodsPhoto = dfsUtil.Upload(local);

			String goodsBigkind = request.getParameter("goodsBigkind");
			String publishCategory = request.getParameter("publishCategory");
			String openid = request.getParameter("openid");

			System.out.println(publishCategory);
			if(publishCategory.equals("失物寻找")) {
				GoodInfo findGood = new GoodInfo(goodsId,goodsSmallkind, goodsPostscript, goodsPubtime, goodsContact, goodsContactWay, goodsPhoto, goodsBigkind,openid);
				publishService.insertSubmitToFindGood(findGood);
				
				System.out.println(findGood.getGoodsId());
				
				return "yes";
			}else {
				GoodInfo findOwner = new GoodInfo(goodsId,goodsSmallkind, goodsPostscript, goodsPubtime, goodsContact, goodsContactWay, goodsPhoto, goodsBigkind,openid);
				publishService.insertSubmitToFindOwner(findOwner);
				
				System.out.println(findOwner.getGoodsId());
				
				return "yes";
			}	
		
		
	}
	
	@PostMapping("/findGoodsSubmitNoImg")
	@ResponseBody
	public String submitDataNoImg(HttpServletRequest request) throws Exception {
		GoodInfo findGood = new GoodInfo();
		GoodInfo findOwner = new GoodInfo();
		
		String id = UUID.randomUUID().toString();
		String goodsId=id.replace("-", "");
		
		String publishCategory = request.getParameter("publishCategory");
		
		String goodsPhoto = "group1/M00/00/00/rBAAEV1c5VWAALgYAABAcXnlud8008.jpg";
		
		System.out.println(publishCategory);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		String goodsPubtime = sdf.format(new Date());
		
		if(publishCategory.equals("失物寻找")) {
			findGood.setGoodsId(goodsId);
			findGood.setGoodsSmallkind(request.getParameter("goodsSmallkind"));
			findGood.setGoodsPostscript(request.getParameter("goodsPostscript"));
			findGood.setGoodsPubtime(goodsPubtime);
			findGood.setGoodsContact(request.getParameter("goodsContact"));
			findGood.setGoodsContactWay(request.getParameter("goodsContactWay"));
			findGood.setGoodsPhoto(goodsPhoto);
			findGood.setGoodsBigkind(request.getParameter("goodsBigkind"));
			findGood.setOpenid(request.getParameter("openid"));
			
			publishService.insertSubmitToFindGood(findGood);
			
			System.out.println(findGood.getGoodsId());
			
			return "yes";
		}else {
			findGood.setGoodsId(goodsId);
			findOwner.setGoodsSmallkind(request.getParameter("goodsSmallkind"));
			findOwner.setGoodsPostscript(request.getParameter("goodsPostscript"));
			findOwner.setGoodsPubtime(goodsPubtime);
			findOwner.setGoodsContact(request.getParameter("goodsContact"));
			findOwner.setGoodsContactWay(request.getParameter("goodsContactWay"));
			findOwner.setGoodsPhoto(goodsPhoto);
			findOwner.setGoodsBigkind(request.getParameter("goodsBigkind"));
			findOwner.setOpenid(request.getParameter("openid"));
			
			publishService.insertSubmitToFindOwner(findOwner);
			
			System.out.println(findOwner.getGoodsId());
			
			return "yes";
		}

	}
	
}
