package com.khadri.spring.mvc.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestRequestCookieController {

	
	@RequestMapping("/cook")
	@ResponseBody
	public String cookie(@CookieValue("JSESSIONID") String cook) {
		
		return "JSESSIONID===> "+cook;
	}
	
	
}
