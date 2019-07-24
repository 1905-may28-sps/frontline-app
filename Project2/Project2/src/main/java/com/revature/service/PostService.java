package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Post;
import com.revature.repository.PostRepository;

@Service
public class PostService {
	
	
	@Autowired
	PostRepository postRepo;
	
	public Post add(Post p) {
		return postRepo.save(p);
		
	}
	
	public List<Post> getAll(){
		return postRepo.findAll();
	}
	
	public List<Post> findByBodyContainingIgnoreCaseOrBodyContainingIgnoreCase(String keyword1, String keyword2){
		return postRepo.findByBodyContainingIgnoreCaseOrBodyContainingIgnoreCase(keyword1, keyword2);
		
	}
	
	public List<Post> findByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(String keyword1, String keyword2){
		return postRepo.findByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(keyword1, keyword2);
}
}