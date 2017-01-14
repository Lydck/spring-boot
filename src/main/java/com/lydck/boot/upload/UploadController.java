package com.lydck.boot.upload;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	/*@RequestMapping("/upload")
	public @ResponseBody String aaa(HttpServletRequest request) {
		return "url:" + request.getRequestURI() + " can access";
	}*/
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public @ResponseBody String aaa(MultipartFile file) {
		try {
			System.out.println(file.getOriginalFilename());
			FileUtils.writeByteArrayToFile(new File("D:/upload/" + file.getOriginalFilename()), file.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("-------------error");
		}
		return "OK";
	}
}
