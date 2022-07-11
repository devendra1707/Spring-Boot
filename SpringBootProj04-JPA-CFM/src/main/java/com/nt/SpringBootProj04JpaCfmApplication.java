package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entities.Employee;
import com.nt.repository.UserRepository;

@SpringBootApplication
public class SpringBootProj04JpaCfmApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProj04JpaCfmApplication.class, args);
		UserRepository userRepository = ctx.getBean(UserRepository.class);

		/*		// create Employee object
				Employee emp1 = new Employee();
				emp1.setName("Rahul");
				emp1.setCity("Azamghan");
				emp1.setState("MP");
				emp1.setDesinnation("DevOps Developer");
		       
				Employee emp2 = new Employee();
				emp2.setCity("Varansi");
				emp2.setDesinnation("UI Developer");
				emp2.setName("Vishnu Kr. Patel");
				emp2.setState("AP");
		
				Employee emp3 = new Employee();
				emp3.setCity("Jaunpur");
				emp3.setDesinnation("Java Developer");
				emp3.setName("Anil Kr. Prajapati");
				emp3.setState("UP");
				
				Employee emp4 = new Employee();
				emp4.setCity("Jaunpur");
				emp4.setDesinnation("PHP Developer");
				emp4.setName("Atul Gupta");
				emp4.setState("UP");
				
				Employee emp5 = new Employee();
				emp5.setCity("Jaunpur");
				emp5.setName("Sabir Ansari");
				emp5.setState("UP");
				emp5.setDesinnation("Python Developer");
				
				// save all Employee Records
		
				List<Employee> employee = List.of(emp1, emp2, emp3, emp4, emp5);
				Iterable<Employee> allEmp = userRepository.saveAll(employee);
				allEmp.forEach(emp -> {
					System.out.println(emp);
				});
		*/

		/*  List<Employee> emp = userRepository.findByName("Sabir Ansari");
			emp.forEach(e -> {
				System.out.println(e);
			});
		*/

		List<Employee> emp = userRepository.findByNameAndCity("Rahul", "Azamghan");
		emp.forEach(e -> System.out.println(e));

	}
}
