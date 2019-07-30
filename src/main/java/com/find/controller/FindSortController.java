package com.find.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.find.pojo.GoodInfo;
import com.find.service.FindGoodService;
import com.find.service.FindOwnerService;

@Controller
public class FindSortController {
	
	@Autowired
	private FindGoodService goodService;
	@Autowired
	private FindOwnerService ownerService;

	@ResponseBody
	@RequestMapping("/findGoodsSort")
	public List<GoodInfo> findGoodsSort(HttpServletRequest request) throws Exception{
		
		Integer page = Integer.parseInt(request.getParameter("page"));
		String kind = new String(request.getParameter("kind").getBytes("UTF-8"),"UTF-8");
		System.out.println(kind);
		if(kind.equals("全部")) {
			return goodService.findGoodSortByPubtime(page);
		}else {
			return goodService.findGoodSortByPubtimeAndKind(kind, page);
		}
		
	}
	
	@ResponseBody
	@RequestMapping("/findOwnerSort")
	public List<GoodInfo> findOwnerSort(HttpServletRequest request) throws Exception{
		Integer page = Integer.parseInt(request.getParameter("page"));
		String kind = new String(request.getParameter("kind").getBytes("UTF-8"),"Utf-8");
		System.out.println(kind);
		if(kind.equals("全部")) {
			return ownerService.findGoodSortByPubtime(page);
		}else {
			return ownerService.findGoodSortByPubtimeAndKind(kind, page);
		}
	}
}
