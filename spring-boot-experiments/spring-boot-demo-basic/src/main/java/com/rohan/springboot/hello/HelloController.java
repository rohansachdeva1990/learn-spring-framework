package com.rohan.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// By default GET
	@RequestMapping("/hello")
	public String sayHi(){
		return "Hi!!!";
	}
}
