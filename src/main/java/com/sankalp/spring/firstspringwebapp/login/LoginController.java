package com.sankalp.spring.firstspringwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(getClass());
	// localhost:8080/login?name=tom
	@RequestMapping("/login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {						// using a request parameter
		
		model.put("user", name);
		
		logger.debug("Request param is {}", name);													// logs only at debug level
		logger.info("Request param = {}", name);													// logs only at info level
																									
// configure logs according to the log level required
//		System.out.println("Request param is " + name);
		
		return "login";
	}
}
