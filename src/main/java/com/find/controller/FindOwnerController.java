package com.find.controller;

import com.alibaba.fastjson.JSON;
import com.find.pojo.FindOwner;
import com.find.service.FindOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

@Controller
public class FindOwnerController {

    @Autowired
    private FindOwnerService findOwnerService;

    @RequestMapping("/findOwner/findAll")
    @ResponseBody
    public List<FindOwner> findAll(HttpServletResponse resp) throws IOException{

        resp.setContentType("text/html;charset=utf-8");

        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GEt,POST");
        
//        Writer out = resp.getWriter();
//
        List<FindOwner> findOwner = findOwnerService.sortByPubtime();
        
//        for (FindOwner findOwners:findOwner) {
//            System.out.println(findOwners);
//            //out.write(JSON.toJSONString(findOwner));
//        }
        return findOwner;
//      
//        System.out.println(findOwnerService.selectData());
//
//        out.flush();
//        return findOwner;
    }
}
