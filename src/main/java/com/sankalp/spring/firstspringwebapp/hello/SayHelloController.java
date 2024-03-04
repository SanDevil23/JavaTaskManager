package com.sankalp.spring.firstspringwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are we learning today";
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String sayHelloHTML() {
		StringBuffer sb =new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> WebPage w/ Java Spring");
		sb.append("</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1> First HTML page with Java Spring</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
	// sayHello --jsp file
	// /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String sayHelloJSP() {
		return "sayHello";
	}
	
	@RequestMapping("/find-fact")
	public String findFactorial() {
		return "factorial";
	}
}
