package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Comment;
import com.revature.repository.CommentRepository;

@Service
public class CommentService {
	@Autowired
	CommentRepository comRepo;
	
	public Comment add(Comment c) {
		return comRepo.save(c);
	}
	
	public List<Comment> getAll(){
		return comRepo.findAll();
	}

}
