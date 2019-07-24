package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.User;
import com.revature.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository dao;
	
	public User add(User user) {
		return dao.save(user);
	}
	
	public List<User> getAll(){
		return dao.findAll();
	}

	public List<User> getByUserId(int userId){
		return dao.findByUserId(userId);
	}


}
