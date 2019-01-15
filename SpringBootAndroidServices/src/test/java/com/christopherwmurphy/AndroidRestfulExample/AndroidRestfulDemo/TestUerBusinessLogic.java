package com.christopherwmurphy.AndroidRestfulExample.AndroidRestfulDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.christopherwmurphy.AndroidRestfulExample.User.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUerBusinessLogic {
	
	@Autowired
    private UserService uService;
	
	@Test
	public void UserLogonNoUserName() {
		
		String resp = uService.LogOnUser("", "12345");
		assert ("The user doesn't exist or the password is incorrect.").equals(resp);
	}
	
	@Test
	public void UserLogonNoPassword() {
		
		String resp = uService.LogOnUser("cmurphy", "");
		assert ("The user doesn't exist or the password is incorrect.").equals(resp);
	}
	
}
