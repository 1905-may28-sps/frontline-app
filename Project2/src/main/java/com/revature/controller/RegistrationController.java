package com.revature.controller;

import java.util.List;

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
@CrossOrigin("*")

public class RegistrationController {
	@Autowired
	private UserService service;
	
	@RequestMapping(value="/users/register", method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> add(@RequestBody User user){
		System.out.println(user);
		User r=service.add(user);
		return new ResponseEntity<User>(r, HttpStatus.CREATED);
	}
		
		
		@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<User> uploadImage(@RequestBody User user){
			System.out.println(user);
			
			User r=service.uploadImage(user.getImage(), user.getUserId());
			return new ResponseEntity<User>(r, HttpStatus.CREATED);	
	}

}