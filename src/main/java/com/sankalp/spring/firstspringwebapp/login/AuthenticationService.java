package com.sankalp.spring.firstspringwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean authenticate(String username, String pass) {
		boolean isValidUserName = username.equalsIgnoreCase("Sankalp");
		boolean isValidPassword = pass.equalsIgnoreCase("mnvi");
		
		
		return isValidUserName && isValidPassword;
	}
}
