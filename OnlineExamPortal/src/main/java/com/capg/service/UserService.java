package com.capg.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import com.capg.exception.UserNotFoundException;
import com.capg.model.User;

import ch.qos.logback.core.status.Status;

public interface UserService {

	public ResponseEntity<List<User>> getUsers();

	// user profile functionality
	
	public String registerUser(@Valid User user);
	
	public String loginUser(@Valid User user);
	
	public ResponseEntity<User> getUserById(Long userId) throws UserNotFoundException;
	
	public ResponseEntity<User> updateUserById(Long userId, User user) throws UserNotFoundException;
	
	public ResponseEntity<User> deleteUserById(Long userId) throws UserNotFoundException;
}
