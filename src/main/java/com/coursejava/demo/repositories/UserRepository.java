package com.coursejava.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursejava.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
