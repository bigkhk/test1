package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("a")
	public String m1() {
		return "helloworld-----";
	}
	
	@RequestMapping("ab")
	public String m2() {
		return "m2()-----";
	}
	
}  
