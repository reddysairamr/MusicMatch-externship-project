package com.example.MusicMatchApp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.MusicMatchApp.model.User;
import com.example.MusicMatchApp.repository.UserRepository;
import com.example.MusicMatchApp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	UserRepository userRepository ;
	public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
	
	@Override
	public User getUserById (Integer id) {
		return userRepository.findById(id).orElse(null) ;
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user) ;
		
	}

	@Override
	public void updateUser(User user) {
		userRepository.save(user) ;
		
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id) ;
		
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
}
