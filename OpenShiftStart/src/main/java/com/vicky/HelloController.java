package com.vicky;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping(path="/hello")
	@ResponseBody
	public String sayHello() {
		return "Welcome to Openshift";
	}

}
