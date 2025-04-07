package com.shivaji.service;

import java.util.List;

import com.shivaji.entity.User;

public interface UserService {
	//create 
	User saveUser(User user);
	
	//get all users
	List<User> getAllUsers();
	
	//get single user of specific Id
	User getUser(String userId);
}
