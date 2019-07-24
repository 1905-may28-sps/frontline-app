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

import com.revature.beans.Post;
import com.revature.service.PostService;

@RestController
@RequestMapping("/post")
@CrossOrigin ("*")
public class PostController {
	
	@Autowired
	private PostService service;
	
	@RequestMapping
	public ResponseEntity<List<Post>> findAll(){
		List<Post> Posts = service.getAll();
		if(Posts == null || Posts.size() == 0) return new ResponseEntity<List<Post>>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<List<Post>>(Posts, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST, 
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Post> add(@RequestBody Post p){
		p = service.add(p);
		return new ResponseEntity<Post>(p, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/{keyword1,keyword2}")
	public ResponseEntity<List<Post>> findByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(@PathVariable String keyword1, String keyword2){
		return new ResponseEntity<List<Post>>(service.findByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(keyword1, keyword1), HttpStatus.OK);
	}
	
//	@RequestMapping(value="/{keyword1,keyword2}")
//	public ResponseEntity<List<Post>> findByBodyContainingIgnoreCaseOrBodyContainingIgnoreCase(@PathVariable String keyword1, String keyword2){
//		return new ResponseEntity<List<Post>>(service.findByBodyContainingIgnoreCaseOrBodyContainingIgnoreCase(keyword1, keyword1), HttpStatus.OK);
//	}
//	
//	

}