package com.SpringBoot.AdvanceTutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/")
	public String helloWorld() {
		return "welcome to the login page!";
	}
	
}
