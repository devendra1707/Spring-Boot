package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.dao.UserRepository;
import com.nt.entities.User;

@SpringBootApplication
public class SpringBootProj03JpaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBootProj03JpaApplication.class, args);

		UserRepository userRepository = ctx.getBean(UserRepository.class);

		/*	// Create User Object
		
			User user = new User();
			user.setName("Devendra Kumar Patel");
			user.setCity("Jaunpur");
			user.setStatus("Java Developer");
			
			User user1 = userRepository.save(user);
			System.out.println(user1);
		*/

		/*   // create & Save Multiple User
			// create User Object
			User user1 = new User();
			user1.setName("Anil Prajapati");
			user1.setCity("Jaunpur");
			user1.setStatus("Software Developer");
			
			User user2 = new User();
			user2.setName("Suraj Maurya");
			user2.setCity("Delhi");
			user2.setStatus("PHP Developer");
			
			// saving single user
			// User user1 = userRepository.save(user);
			
			List<User> users = List.of(user1, user2);
			// Save multiple objects
			Iterable<User> result = userRepository.saveAll(users);
			result.forEach(user -> {
				System.out.println(user);
			});
			
			//		System.out.println("Save User :: "+result);
			System.out.println("Done !!!");
		*/

		/*	// Update the user records
		
			Optional<User> optional = userRepository.findById(1);
			User user = optional.get();
			user.setName("Devendra Kr. Patel");
			User result = userRepository.save(user);
			System.out.println(result);
		*/

		/*	// How to get the data only one
			Optional<User> optional = userRepository.findById(1);
			User user = optional.get();
			System.out.println(user);
		*/

		// How to get all data
//Rule : 1
		/*	Iterable<User> itr = userRepository.findAll();
			Iterator<User> iterator = itr.iterator();
			while (iterator.hasNext()) {
				User user = iterator.next();
				System.out.println(user);
			}*/
//Rule: 2

		/*Iterable<User> itr = userRepository.findAll();
		itr.forEach(new Consumer<User>() {
		
			@Override
			public void accept(User t) {
		
				System.out.println(t);
			}
		});
		*/
//Rule : 3
		/*Iterable<User> itr = userRepository.findAll();
		itr.forEach(user -> {
			System.out.println(user);
		});
		*/

		/*	// Delete user element
			 userRepository.deleteById(1);
			 System.out.println("Deleted");
			*/

		/*Iterable<User> allUser = userRepository.findAll();
		allUser.forEach(user -> {
			System.out.println(user);
			userRepository.deleteAll(allUser);
			System.out.println("All data Deleted....");
		});
		*/
	}

}
