package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entities.User1;

public interface UserRepository extends CrudRepository<User1, Integer> {

}
