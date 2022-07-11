package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String home() {
		System.out.println("This is Home Page...");
		return "home";
	}

//	@RequestMapping("/contact")
	@GetMapping("/contact")
	public String contact() {
		System.out.println("This in contact...");
		return "contact";
	}
}
