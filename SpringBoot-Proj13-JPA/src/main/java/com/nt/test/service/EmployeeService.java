package com.nt.test.service;

import java.util.List;

import com.nt.test.entity.Employee;

public interface EmployeeService {

	List<Employee> getEmployees();

	Employee saveEmployee(Employee employee);
}
