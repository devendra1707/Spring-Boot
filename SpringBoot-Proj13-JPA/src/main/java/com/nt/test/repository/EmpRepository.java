package com.nt.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.test.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {

}
