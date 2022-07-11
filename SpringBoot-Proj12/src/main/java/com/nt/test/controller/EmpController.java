package com.nt.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.test.model.Employee;
import com.nt.test.service.EmpService;

@RestController

public class EmpController {

	// localhost:8080/api/v1/employees

	@Autowired
	private EmpService eService;

	// localhost:8080 
	@GetMapping("/")
	public List<Employee> getEmployees() {
		return eService.getEmployees();

	}

	// localhost:8080/employee/15

	@GetMapping("/employee/{id}")
	public String getEmployee(@PathVariable("id") Long id) {
		return "Fetching the employee details for the id :: " + id;
	}

//	localhost:8080/emp
	@PostMapping("/emp")
	public String saveEmployee(@RequestBody Employee employee) {
		return "Saveing the Employee Details to the DataBase :: " + employee;
	}

	// localhost:8080/employees/34

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		System.out.println("Updating the Employee Data for the id :: " + id);
		return employee;
	}

	// localhost:8080/employees?id=34
	@DeleteMapping("/employees")
//	public String deleteEmployee(@RequestParam("id") Long id) {
	public String deleteEmployee(@RequestParam Long id) {
		return "Deleting the employee details for the id :: " + id;
	}

}
