package com.amit.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class SayHelloController {
	
	
	
	@RequestMapping("say-hello")
	@ResponseBody
	String sayHello() {
		
		return "hello what are you doing!!";
	}
	
	@RequestMapping("say-hello-jsp")
	 String sayHelloJsp() {
		
		return "sayHello";
	}

}
