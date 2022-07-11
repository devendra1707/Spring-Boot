package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entities.Customer;
import com.nt.repository.CustomerRepositoy;

@SpringBootApplication
public class SpringBootProj05JpqlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProj05JpqlApplication.class, args);
		CustomerRepositoy customerRepositoy = ctx.getBean(CustomerRepositoy.class);

		/*	
			// Create Customer class Object
		
			Customer ctr = new Customer();
			ctr.setcName("Devendra Kr. Patel");
			ctr.setcCity("Jaunpur");
			ctr.setcDist("Jaunpur");
			ctr.setcMail("deva123@gmail.com");
			ctr.seteType("Regular");
			ctr.setcPhNo(9898981234L);
		
			Customer ctr1 = new Customer();
			ctr1.setcCity("Allahabad");
			ctr1.setcDist("Allahabad");
			ctr1.setcName("Sachin Yadav");
			ctr1.seteType("Regular");
			ctr1.setcMail("sachin123@gmail.com");
			ctr1.setcPhNo(9898981234l);
		
			Customer ctr2 = new Customer();
			ctr2.setcCity("Bhadohi");
			ctr2.setcDist("Bhadohi");
			ctr2.setcMail("ajay46@gmail.com");
			ctr2.setcName("Ajay Yadav");
			ctr2.setcPhNo(9898987895l);
			ctr2.seteType("Regular");
		
			Customer ctr3 = new Customer();
			ctr3.setcCity("Jaunpur");
			ctr3.setcDist("Jaunpur");
			ctr3.setcMail("suraj5454@gmail.com");
			ctr3.setcName("Suraj Maurya");
			ctr3.setcPhNo(9898986512L);
			ctr3.seteType("Regular");
		
			Customer ctr4 = new Customer();
			ctr4.setcCity("Jaunpur");
			ctr4.setcDist("Jaunpur");
			ctr4.setcMail("anil5454@gmail.com");
			ctr4.setcPhNo(9898984562l);
			ctr4.seteType("Regular");
		
			// Save All Records
			List<Customer> customers = List.of(ctr, ctr1, ctr2, ctr3, ctr4);
			Iterable<Customer> cust = customerRepositoy.saveAll(customers);
			cust.forEach(e -> System.out.println(e));
		*/

		List<Customer> allCust = customerRepositoy.getAllCustomer();
		allCust.forEach(e -> System.out.println(e));
System.out.println("--------------------------------------------------");
		List<Customer> cust = customerRepositoy.getCustomerByName("Suraj Maurya", "Jaunpur");
		cust.forEach(e -> System.out.println(e));
		System.out.println("---------------------------------------------------");
	}

}
