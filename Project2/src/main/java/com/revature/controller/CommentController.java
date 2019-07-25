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

import com.revature.beans.Comment;
import com.revature.service.CommentService;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value="/comment")

public class CommentController {
	@Autowired
	CommentService service;

	
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<List<Comment>> findAll(){
	return new ResponseEntity<List<Comment>>(service.getAll(), HttpStatus.OK);
}
@RequestMapping(method=RequestMethod.POST,
consumes=MediaType.APPLICATION_JSON_VALUE, 
produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Comment> add(@RequestBody Comment comm){
Comment c=service.add(comm);
if(c == null) return new ResponseEntity<Comment>(HttpStatus.CONFLICT);
return new ResponseEntity<Comment>(c, HttpStatus.CREATED);

}


}
