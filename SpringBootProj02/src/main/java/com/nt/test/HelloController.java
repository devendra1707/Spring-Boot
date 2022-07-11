package com.nt.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String helloCOntroller() {
		return "Welcome to Spring Boot...";
	}
}
