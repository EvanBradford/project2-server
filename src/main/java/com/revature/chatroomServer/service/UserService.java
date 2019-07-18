package com.revature.chatroomServer.service;

import java.util.List;

import com.revature.chatroomServer.models.User;


public interface UserService {

	void registerUser(User user);

	List<User> list();
	
	User findOne(Integer id);

	User findByEmailAndPassword(String email, String password);
	
	void delete(Integer id);

	void update(User user);
	
	

}