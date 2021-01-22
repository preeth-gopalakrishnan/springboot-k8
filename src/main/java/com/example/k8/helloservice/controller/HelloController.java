package com.example.k8.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

	@Value("${helloservice.greet.msg}") 
	private String msg;
	
	
	
	@GetMapping(value = "/greet/{name}")
	@ResponseBody()
	public String sayHello(@PathVariable String name) {
		return "Hello " + name +" "+ msg;
	}
}
