package com.find.controller;

import java.io.IOException;
import java.io.Writer;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PublishController {

	@RequestMapping("/publish/submit_data")
	public void submitData(HttpServletResponse resp,String userid,String username,String goods_bigkind,String goods_smallkind,String goods_postscrit,String goods_contact,String goods_contact_way) throws IOException {
		
//		resp.setContentType("text/html;charset=utf-8");
		
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET,POST");
		
		System.out.println(userid + "-"+username+"-"+goods_bigkind+"-"+goods_smallkind+"-"+goods_postscrit+"-"+goods_contact+"-"+goods_contact_way);
	}
}
