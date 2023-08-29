package com.khadri.spring.mvc.comtroller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestRequestParamController {

	// ../test/array?food=idly&food=dosa
	@RequestMapping("/array")
	@ResponseBody
	public String paramArray(@RequestParam("food") String[] tiffen) {

		StringBuffer buffer = new StringBuffer();
		for (String each : tiffen) {
			buffer.append(each);
			buffer.append(",");
		}

		return " " + buffer.substring(0, buffer.length() - 1);
	}

	// ../test/list?food=idly&food=dosa
	@RequestMapping("/list")
	@ResponseBody
	public String paramArray(@RequestParam("food") List<String> tiffen) {
		return " " + tiffen;
	}

	// ../test/map?food1=idly&food2=dosa
	@RequestMapping("/map")
	@ResponseBody
	public String paramArray(@RequestParam Map<String, String> tiffen) {
		return " " + tiffen;
	}
	
	
	

}
