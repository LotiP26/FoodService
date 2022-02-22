package com.cogent.fooddeliveryapp.service;

import java.util.List;
import java.util.Optional;

import com.cogent.fooddeliveryapp.dto.User;

public interface UserService {
	//update can by user?  
	public User addUser(User user);
	public Optional<User> getUserById(long id);
	public List<User> getAllUsers();
	public String deleteUserById(long id); // manage by user 
	public User updateUser(User user);
	public List<User> getAllUsersAscOrder(); // accending query
	public List<User> getAllUsersAsdOrder(); // decending query // we go signature date of joining
	
}

