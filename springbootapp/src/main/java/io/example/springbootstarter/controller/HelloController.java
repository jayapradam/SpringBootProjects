package io.example.springbootstarter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	/*
	 * @RequestMapping only maps to the GET method by default. To map to other HTTP methods, 
	 * we will have to specify it in the annotation.
	 */
	public String sayHi()
	{
		return "Hi";
	}

}
