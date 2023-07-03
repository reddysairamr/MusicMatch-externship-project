package com.example.MusicMatchApp.service;

import java.util.List;

import com.example.MusicMatchApp.model.User;

public interface UserService {
	void createUser (User user) ;
	void updateUser (User user) ;
	void deleteUser(Integer id) ;
	
	List<User> getAllUsers() ;
	User getUserById (Integer id) ;
}
