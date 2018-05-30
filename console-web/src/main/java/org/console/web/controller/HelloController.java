package org.console.web.controller;

import org.console.web.property.RedisConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Autowired
	private RedisConfig config;
	
	@GetMapping("/test1")
	public Object test() {
		
		return config;
	}
	
}
