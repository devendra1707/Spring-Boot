package com.nt.dao;

import org.springframework.data.repository.CrudRepository;

import com.nt.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}