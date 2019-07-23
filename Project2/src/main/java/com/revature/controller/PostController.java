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
import com.revature.service.PostService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/post")
public class PostController {
	@Autowired
	private PostService service;
	
	@RequestMapping(method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_JSON_VALUE, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Post> add(@RequestBody Post post){
		Post p=service.add(post);
		if(p == null) return new ResponseEntity<Post>(HttpStatus.CONFLICT);
		return new ResponseEntity<Post>(p, HttpStatus.CREATED);
	
	}
	
	@RequestMapping(method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Post>> findAll(){
		return new ResponseEntity<List<Post>>(service.getAll(), HttpStatus.OK);
	}
	

}
