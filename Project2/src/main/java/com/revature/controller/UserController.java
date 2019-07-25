package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.revature.beans.User;
import com.revature.service.UserService;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	@Autowired
	private UserService service;
	
	
	@RequestMapping(value="/users", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> findAll(){
		return new ResponseEntity<List<User>>(service.getAll(), HttpStatus.OK);
	}
	
	
	//change to post
	
	
	

	
	
}
