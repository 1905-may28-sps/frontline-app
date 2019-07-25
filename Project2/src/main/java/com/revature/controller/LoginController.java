package com.revature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Post;
import com.revature.beans.User;
import com.revature.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {

	@Autowired
	private UserService  service;
	//change to post
	@RequestMapping(value="/users/login",method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<User> login(@RequestBody User user) {
		System.out.println("first thing that should show up");
		
		System.out.println(user);
		User u = service.login(user.getUsername(), user.getPassword());
		
			if (u==null) {
		return new ResponseEntity<User>(HttpStatus.CONFLICT);
			}
			else return new ResponseEntity<User>(u, HttpStatus.CREATED);
				
				//getUsername().equals("username") && user.getPassword().equals("password");
	}
	
	
}
