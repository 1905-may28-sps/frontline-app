package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Post;
import com.revature.beans.User;
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
}
