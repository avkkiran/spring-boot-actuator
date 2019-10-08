package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "Home - Hello world!!!";
	}
	
	@GetMapping("/home")
	public String homeController() {
		return "Home controller!!!";
	}
}
