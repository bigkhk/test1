package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("a")
	public String m1() {
		return "helloworld-----";
	}
	
	@GetMapping("ab")
	public String m2() {
		return "m2()-----";
	}
	
}  
