package com.christopherwmurphy.AndroidRestfulExample.User;

import org.springframework.stereotype.Service;
import com.christopherwmurphy.AndroidRestfulExample.Utils.Constants;

@Service
public class UserService {

	public String LogOnUser(String userName, String password) {
		
		if( !Constants.EMPTY.equals(userName)  &&
			!Constants.EMPTY.equals(password)) {
			return "User " + userName + " has been logged on";
		}
		else {
			return "The user doesn't exist or the password is incorrect.";
		}
	}
}
