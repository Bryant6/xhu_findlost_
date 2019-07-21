package com.find.util;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUtil {

	public String upload(MultipartFile file,HttpServletRequest req) throws Exception {
		
		if(file.getSize()>1000*1024) {
			return null;
		}
		String uuid = UUID.randomUUID().toString();
		
		String type = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		String newName = uuid + type;
		
		String realPath = req.getServletContext().getRealPath("upload");
		
		File fi = new File(realPath);
		if(!fi.exists()) {
			fi.mkdir();
		}
		
		File fil = new File(realPath,newName);
		file.transferTo(fil);
		
		return realPath+"/"+newName;
	}
}
