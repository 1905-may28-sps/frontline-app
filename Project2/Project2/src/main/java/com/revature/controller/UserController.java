package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.User;
import com.revature.service.UserService;


@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping()
	public ResponseEntity<List<User>> findAll(){
		List<User> users = service.getAll();
		if(users == null || users.size() == 0) return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	//POST -/user
	@RequestMapping(method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> add(@RequestBody User user){
		
		//lets assume we will always have 201 status
		user = service.add(user);
		return new  ResponseEntity<User>(user, HttpStatus.CREATED);
	}
	@RequestMapping (value ="/{userId}")
	public ResponseEntity<List<User>> findByUserId(@PathVariable int userId){
		return new ResponseEntity<List<User>>(service.getByUserId(userId), HttpStatus.OK);
	}
	

}