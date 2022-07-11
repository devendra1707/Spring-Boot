package com.nt.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.test.entity.Employee;
import com.nt.test.repository.EmpRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmpRepository eRepository;

	@Override
	public List<Employee> getEmployees() {

		return eRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return eRepository.save(employee);
	}
}
