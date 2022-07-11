package com.nt.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
//	@GetMapping("/")
	public String helloWord() {
		return "Welcome Spring-Program...";
	}
}
