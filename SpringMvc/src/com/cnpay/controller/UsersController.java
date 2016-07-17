package com.cnpay.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cnpay.model.Users;
import com.cnpay.service.UsersService;

@Controller
@RequestMapping("/users")
public class UsersController {
	
	private Logger logger=Logger.getLogger(this.getClass());
	@Autowired
	private UsersService usersService;
	
	@RequestMapping("/index")
	public String index(){
		return "success";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam String username,String password){
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("username", username);
		param.put("password", password);
		try {
			usersService.insertUsers(param);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("--------用户添加------", e);
		}
		return "success";
	}
	
	@RequestMapping("/del")
	public String delete(@RequestParam int id){
		try {
			usersService.deleteUsers(id);
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("--------用户删除------", e);
		}
		
		return "success";
	}
	
	@RequestMapping("/searchUser")
	public String searchUser(){
		List<Users> userList = usersService.searchUsers();
		for (Users users : userList) {
			System.out.println("userName:"+users.getUsername());
		}
		return "success";
	}
}
