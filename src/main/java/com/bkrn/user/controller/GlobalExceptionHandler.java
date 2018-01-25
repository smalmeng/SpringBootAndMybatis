package com.bkrn.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/** 
* @ClassName: GlobalExceptionHandler 
* @Description: TODO(全局异常拦截器) 
* @author lim 
* @date 2018年1月24日 上午10:48:51 
*  
*/
@ControllerAdvice
public class GlobalExceptionHandler {

	
	
	@ExceptionHandler(RuntimeException.class) //捕获所有的运行异常
	@ResponseBody // 拦截返回时json返回的结果
	public Map<String,Object> exceptionHandler(){
		HashMap<String,Object> result = new HashMap<String, Object>();
		result.put("code", "500");
		result.put("msg", "亲，系统错误!");
		return result;
	}
}
