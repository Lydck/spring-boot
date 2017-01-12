package com.lydck.boot.requestparam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestControllerDemo {
	@RequestMapping(value = "/getjson", produces = "application/json;charset=UTF-8")
	public DemoObj getjson() {
		DemoObj demoObj = new DemoObj();
		demoObj.setId(520);
		demoObj.setName("向亚军");
		return demoObj;
	}
	
	@RequestMapping(value = "/getxml", produces = "application/xml;charset=UTF-8")
	public DemoObj getXml() {
		DemoObj demoObj = new DemoObj();
		demoObj.setId(520);
		demoObj.setName("向亚军");
		return demoObj;
	}
	
}
