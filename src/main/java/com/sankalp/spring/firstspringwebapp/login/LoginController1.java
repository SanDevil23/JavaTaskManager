package com.sankalp.spring.firstspringwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController1 {
	private AuthenticationService authenticationService;
	
	public LoginController1(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="/login-new", method = RequestMethod.GET)
	public String gotoLoginPage() {
																									
		return "loginNew";
	}
	
	@RequestMapping(value="/login-new", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String pass, ModelMap model) {
		if (authenticationService.authenticate(name, pass)) {
		
			model.put("user", name);
			return "welcome";
		}
		model.put("errorMessage","Invalid Credentials! Please try again." );
		return "loginNew";
	}
}