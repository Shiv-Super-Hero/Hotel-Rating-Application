package com.shivaji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivaji.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
}
