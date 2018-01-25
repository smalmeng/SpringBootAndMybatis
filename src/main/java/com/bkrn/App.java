package com.bkrn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages={"com.bkrn.user.controller","com.bkrn.user.service"}) //组件扫描，可自动发现和装配一些Bean。
@MapperScan(basePackages="com.bkrn.user.dao")    //扫描dao 包
@EnableAutoConfiguration  //运行注解
public class App {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
	


}
