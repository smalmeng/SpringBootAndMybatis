package com.bkrn.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bkrn.user.entity.BtUser;
import com.bkrn.user.service.UserService;

@Controller
public class IndexController {
	
	
	
	@Autowired
	UserService userService;
	
	@Value("${name}")
	private String name; //在配置文件中去数据
	
/*	@Autowired 
	BtUserMapper btUserMapper;*/
	
	@RequestMapping("/index")
	public String index(ModelMap map){
		
		 List<BtUser> list  =	userService.findUserlist();
		 
		map.put("name", "墨迹天气");
		map.put("project", name);
		map.put("list", list);
		return "index";
	}
	
	
	
	@RequestMapping("/getUserById")
	public String getUserById(ModelMap map,int id){
		
		BtUser userById = userService.getUserById(id);
		List<BtUser> list = new ArrayList<BtUser>();
		list.add(userById);
		System.out.println(name);
		map.put("name", "墨迹天气");
		map.put("list", list);
		map.put("project", name);
		return "index";
	}

}
