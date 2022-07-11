package com.nt.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.nt.entities.Employee;

public interface UserRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findByName(String name);

	public List<Employee> findByNameAndCity(String name, String city);

	public List<Employee> findByNameStartingWith(String name);

	public List<Employee> findByNameEndingWith(String name);

	public List<Employee> findByNameContaining(String words);

}
