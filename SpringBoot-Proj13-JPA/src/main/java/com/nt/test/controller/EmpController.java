package com.nt.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.test.entity.Employee;
import com.nt.test.service.EmployeeService;

public class EmpController {

	// localhost:8080/api/v1

	@Autowired
	private EmployeeService eService;

	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return eService.getEmployees();
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return eService.saveEmployee(employee);
	}
}
