package com.lydck.boot.controlleradvice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lydck.boot.requestparam.DemoObj;

@Controller
public class AdviceController {
	
	@RequestMapping("/advice")
	public String getSomething(@ModelAttribute("msg") String msg, DemoObj obj) {
		throw new IllegalArgumentException("参数错误msg:" + msg);
	}
}
