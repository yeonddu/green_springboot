package com.myboot03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Myboot03Controller {

	@RequestMapping("/main.do")
	public String hello() {
		return "main";
	}
}
