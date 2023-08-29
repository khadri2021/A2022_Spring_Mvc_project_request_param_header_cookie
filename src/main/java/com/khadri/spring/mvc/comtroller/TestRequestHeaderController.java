package com.khadri.spring.mvc.comtroller;

import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestRequestHeaderController {

	// ../test/header/
	@RequestMapping("/header")
	@ResponseBody
	public String headers(@RequestHeader("Accept-Encoding") String accept,
			@RequestHeader("Connection") String conn) {

		return "Accept-Encoding : " + accept + " Connection : " + conn;
	}
	
	// ../test/header/map
	@RequestMapping("/header/map")
	@ResponseBody
	public String headers(@RequestHeader Map<String,String> headers) {
		
		return "All headers : " +headers;
	}
	
	// ../test/headers
	@RequestMapping("/headers")
	@ResponseBody
	public String headers(@RequestHeader HttpHeaders headers) {
		
		return "All headers : " +headers;
	}
	
	
	

}
