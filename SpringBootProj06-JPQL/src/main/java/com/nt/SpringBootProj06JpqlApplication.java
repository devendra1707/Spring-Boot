package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entities.User1;
import com.nt.repository.UserRepository;

@SpringBootApplication
public class SpringBootProj06JpqlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SpringBootProj06JpqlApplication.class, args);
		UserRepository userRepository = ctx.getBean(UserRepository.class);
		
		// Create Object
		User1 u1 = new User1();
		u1.setName("Sabir Ansari");
		u1.setPassword("sa12345");
		User1 user1 = userRepository.save(u1);
		System.out.println(user1);
	}

}
