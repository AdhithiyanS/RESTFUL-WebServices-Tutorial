package com.adhi.RESTFULWebServicesin10Steps.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping(path="/adhi")
	public String getMessage()
	{
		return "Hello World";
	}
	
	
	
}
