package com.bkrn.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class HolleController {

	
	
	@RequestMapping("/hello2")
	public String hello2(){
		
		return "hello2";
	}
/*	public static void main(String[] args) {
		
		SpringApplication.run(HolleController.class, args);
	}*/
}
