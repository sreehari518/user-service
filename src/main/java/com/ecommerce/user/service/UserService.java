package com.ecommerce.user.service;

import org.springframework.stereotype.Service;

import com.ecommerce.user.entity.User;
import com.ecommerce.user.repository.UserRepository;


@Service
public class UserService {
	
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public User getUserById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}
	
	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
