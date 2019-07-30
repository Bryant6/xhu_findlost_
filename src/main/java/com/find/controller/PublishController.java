package com.find.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("/findGoodsSubmit")
	@ResponseBody
	public String submitData(HttpServletRequest request,MultipartFile file) throws Exception {
		
		dfsUtil = new DfsUtil();
		fileUtil = new FileUtil();
		
//			System.out.println("test1");
			String local = fileUtil.upload(file, request);
//			System.out.println("test2");
			
			String goodsSmallkind = request.getParameter("goodsSmallkind");
			String goodsPostscrit = request.getParameter("goodsPostscrit");
//			System.out.println(goodsSmallkind);
			String goodsPubtime = null;
		    String goodsContact = request.getParameter("goodsContact");
			String goodsContact_way = request.getParameter("goodsContact_way");
//			System.out.println("test3");
			System.out.println(local);
			String goodsPhoto = dfsUtil.Upload(local);
//			System.out.println("test4");
			String goodsBigkind = request.getParameter("goodsBigkind");
			String publishCategory = request.getParameter("publishCategory");
//			System.out.println("test5");
			System.out.println(publishCategory);
			if(publishCategory.equals("失物寻找")) {
				goodsPubtime = publishService.selectGoodData();
				GoodInfo findGood = new GoodInfo(null,goodsSmallkind, goodsPostscrit, goodsPubtime, goodsContact, goodsContact_way, goodsPhoto, goodsBigkind);
				publishService.insertSubmitToFindGood(findGood);
				
				return "yes";
			}else {
				goodsPubtime = publishService.selectOwnerData();
				GoodInfo findOwner = new GoodInfo(null,goodsSmallkind, goodsPostscrit, goodsPubtime, goodsContact, goodsContact_way, goodsPhoto, goodsBigkind);
				publishService.insertSubmitToFindOwner(findOwner);
				
				return "yes";
			}	
		
		
	}
	
	@RequestMapping("/findGoodsSubmitNoImg")
	public String submitDataNoImg(HttpServletRequest request) {
		GoodInfo findGood = new GoodInfo();
		GoodInfo findOwner = new GoodInfo();
		
		String publishCategory = request.getParameter("publishCategory");
		
		System.out.println(publishCategory);
		
		if(publishCategory == "失物寻找") {
			findGood.setGoodsSmallkind(request.getParameter("goodsSmallkind"));
			findGood.setGoodsPostscrit(request.getParameter("goodsPostscrit"));
			findGood.setGoodsPubtime(publishService.selectGoodData());
			findGood.setGoodsContact(request.getParameter("goodsContact"));
			findGood.setGoodsContact_way(request.getParameter("goodsContact_way"));
			findGood.setGoodsBigkind(request.getParameter("goodsBigkind"));
			
			publishService.insertSubmitToFindGood(findGood);
			
			return "yes";
		}else {
			findOwner.setGoodsSmallkind(request.getParameter("goodsSmallkind"));
			findOwner.setGoodsPostscrit(request.getParameter("goodsPostscrit"));
			findOwner.setGoodsPubtime(publishService.selectOwnerData());
			findOwner.setGoodsContact(request.getParameter("goodsContact"));
			findOwner.setGoodsContact_way(request.getParameter("goodsContact_way"));
			findOwner.setGoodsBigkind(request.getParameter("goodsBigkind"));
			
			publishService.insertSubmitToFindOwner(findOwner);
			
			return "yes";
		}

	}
	
}
