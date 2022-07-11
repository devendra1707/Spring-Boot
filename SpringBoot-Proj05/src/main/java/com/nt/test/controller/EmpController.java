package com.nt.test.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.test.model.Employee;

@RestController
public class EmpController {

	@GetMapping("/")
	public String getEmloyees() {
		return "Display the List of Employee...";

	}

	// localhost:9090/employee/15

	@GetMapping("/employee/{id}")
	public String getEmployee(@PathVariable("id") Long id) {
		return "Fetching the employee details for the id :: " + id;
	}

	@PostMapping("/emp")
	public String saveEmployee(@RequestBody Employee employee) {
		return "Saveing the Employee Details to the DataBase :: " +employee;
	}

	// localhost:9090/employees?id=34
	@DeleteMapping("/employees")
//	public String deleteEmployee(@RequestParam("id") Long id) {
	public String deleteEmployee(@RequestParam Long id) {
		return "Deleting the employee details for the id :: " + id;
	}

}
