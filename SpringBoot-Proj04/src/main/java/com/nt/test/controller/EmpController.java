package com.nt.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@GetMapping("/")
	public String getEmloyees() {
		return "Display the List of Employee...";

	}

	// localhost:8080/employee/15

	@GetMapping("/employee/{id}")
	public String getEmployee(@PathVariable("id") Long id) {
		return "Fetching the employee details for the id :: " + id;
	}

	// localhost:8080/employees?id=34
	@DeleteMapping("/employees")
//	public String deleteEmployee(@RequestParam("id") Long id) {
	public String deleteEmployee(@RequestParam Long id) {
		return "Deleting the employee details for the id :: " + id;
	}

}
