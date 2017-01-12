package com.lydck.boot.requestparam;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/requestparam")
public class DemoController {
	@RequestMapping(produces = "text/plain")
	public @ResponseBody String index(HttpServletRequest request) {
		return "url:" + request.getRequestURI() + " can access";
	}
	
	@RequestMapping(value = "/pathvar/{str}", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String demoPathVar(@PathVariable String str, HttpServletRequest request) {
		return "url:" + request.getRequestURI() + " can assess,str:" + str;
	}
	
	@RequestMapping(value = "/requestParam", produces = "text/plain;charset=UTF-8")
	public @ResponseBody String passRequestParam(int id, HttpServletRequest request) {
		return "url:" + request.getRequestURI() + " can access,id:" + id;
	}
	
	@RequestMapping(value = "/obj", produces = "application/json;charset=UTF-8")
	@ResponseBody
	public String passObj(DemoObj obj, HttpServletRequest request) {
		return "url:" + request.getRequestURL() + " obj.name:" + obj.getName();
	}
	
	@RequestMapping(value = {"/name1", "name2"}, produces = "text/plain;charset=UTF-8")
	public @ResponseBody String remove(HttpServletRequest request) {
		return "url:" + request.getRequestURL();
	}
}
