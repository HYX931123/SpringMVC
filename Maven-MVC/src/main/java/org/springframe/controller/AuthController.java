package org.springframe.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/auth")
public class AuthController {
	private static final Logger logger=Logger.getLogger(AuthController.class);
	
	@RequestMapping("/login")
	public String login(@RequestParam(value="error", required=false) boolean error){
		logger.info("-------------登陆---------------");
		return "Login";
	}
	
	@RequestMapping("/logout")
	public String logout(){
		logger.info("-------------注销---------------");
		return "logout";
	}
}
