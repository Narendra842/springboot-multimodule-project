package com.jci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jci.entity.User;
import com.jci.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	//save user
	public User saveUserData(User user) {
		User userSaved= userRepository.save(user);
		return userSaved;
	}
	
	// fethch all user
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
}
