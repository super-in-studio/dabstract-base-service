package com.dabstract.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
//@RequestMapping("/base")
public class HelloController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	public String getServicePort() {
		return port;
	}
	
    @GetMapping("/hello")
	public String sayHello() {
         return "hello" ;		
	}
    
    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
