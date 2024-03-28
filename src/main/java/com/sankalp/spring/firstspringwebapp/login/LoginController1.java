package com.sankalp.spring.firstspringwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
@SessionAttributes("user")
public class LoginController1 {
//	private AuthenticationService authenticationService;
//	
//	public LoginController1(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("user", getLoggedinUsername());
		return "welcome";
	}
	
	public String getLoggedinUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
//	@RequestMapping(value="/login-new", method = RequestMethod.POST)
//	public String gotoWelcomePage(@RequestParam String name, @RequestParam String pass, ModelMap model) {
//		if (authenticationService.authenticate(name, pass)) {
//		
//			model.put("user", name);
//			return "welcome";
//		}
//		model.put("errorMessage","Invalid Credentials! Please try again." );
//		return "loginNew";
//	}
}
