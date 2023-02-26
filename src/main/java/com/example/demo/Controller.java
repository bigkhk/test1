package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("a")
	public String m1() {
		return "helloworld 11-----";
	}
	
	@GetMapping("ab")
	public String m2() {
		return "소스 수정 후 war 재 업로드, 서버 종료없이-----";
	}
	
}  
