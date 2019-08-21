package com.find.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.find.pojo.GoodInfo;
import com.find.service.GetInfoService;

@Controller
public class GetInfoController {

	@Autowired
	private GetInfoService getInfoService;
	
	@ResponseBody
	@PostMapping("getInfoById")
	public GoodInfo GetInfoById(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String bigkind= request.getParameter("bigkind");
		
		System.out.println(id + ":" + bigkind);
		
		
		if(bigkind.equals("true")) {
			return getInfoService.getInfoByIdGood(id);
		}else {
			return getInfoService.getInfoByIdOwner(id);
		}
	}
	
}
