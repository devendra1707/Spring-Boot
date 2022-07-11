package com.nt.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nt.test.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	private static List<Employee> list = new ArrayList<>();

	static {
		Employee e = new Employee();
		e.setName("Devendra");
		e.setAge(22);
		e.setDepartment("CSE");
		e.setEmail("deva123@gmail.com");
		e.setLocation("India");
		list.add(e);

		e = new Employee();
		e.setName("Suraj");
		e.setAge(23);
		e.setDepartment("IT");
		e.setEmail("suraj123@gmail.com");
		e.setLocation("India");
		list.add(e);
	}

	@Override
	public List<Employee> getEmployees() {

		return list;
	}

}
