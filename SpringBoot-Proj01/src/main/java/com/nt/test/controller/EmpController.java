package com.nt.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller  
@RestController // (@Controller + @ResponseBody)
public class EmpController {

	// localhost:8080/employees

//	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	@GetMapping("/employees")
//	@ResponseBody
	public String getEmployee() {
		return "Display the list of Employee";
	}
}
