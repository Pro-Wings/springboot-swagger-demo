package com.prowings.myfirstspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = "Hello Controller")
public class HelloController {
	
	@GetMapping("/hello")
	@ApiOperation("Get a greeting message!!")
	public String hello()
	{
		return "Hey Java Developers.. Welcome to SprinBoot!!!";
	}

}
