package com.bkrn.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @ClassName: TestController 
* @Description: TODO(SpringBoot 测试)  @RestController 这个注解==Controller 每个方法上面加上@ResponseBody
* @author lim   
* @date 2018年1月24日 上午9:48:40 
*  
*/
@RestController
//@EnableAutoConfiguration
public class TestController {
	
	
	
	@RequestMapping("/hello")
	public String hello(){
		return "success";
	}
	
/*	public static void main(String[] args) {
		
		//运行
		SpringApplication.run(TestController.class, args);
	}*/
	

}
