package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nt.entities.Customer;

public interface CustomerRepositoy extends CrudRepository<Customer, Integer> {

	@Query("select c FROM Customer c")
	public List<Customer> getAllCustomer();

	/*@Query("select c from Customer c where c.cName = :n")
	public List<Customer> getCustomerByName(@Param("n") String cName);
	*/
	
	@Query("select c from Customer c where c.cName = :n and c.cCity =:c1")
	public List<Customer> getCustomerByName(@Param("n") String cName, @Param("c1") String city);
	
	
	/*@Query("Select * from Customer" , nativeQuery = true)
	public List<Customer> getCustomers();*/

}
