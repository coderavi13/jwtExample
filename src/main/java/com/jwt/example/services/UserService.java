package com.jwt.example.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> userList = new ArrayList<>();
	
	public UserService() {
		userList.add(new User(UUID.randomUUID().toString(), "Ravindra", "ravi@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Rasika", "rasika@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Vedant", "vedant@gmail.com"));
		userList.add(new User(UUID.randomUUID().toString(), "Virat", "virat@gmail.com"));
	}
	
	public List<User> getUsers(){
		return this.userList;
	}
}
