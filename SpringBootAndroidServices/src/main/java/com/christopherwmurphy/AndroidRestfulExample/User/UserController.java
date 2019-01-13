package com.christopherwmurphy.AndroidRestfulExample.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService uService;
    
	@RequestMapping("/UserLogon")
	@ResponseBody
	public String UserLogon(@RequestParam(value="userName") String userName,
			                @RequestParam(value="password") String password) {
		return uService.LogOnUser(userName, password);
	}
	
	@RequestMapping("/UserLogoff")
	public String UserLogOff() {
		return "User is logged off";
	}
	
	@RequestMapping()
	public String UpdateUser(){
		return "User has been updated";
	}
}
