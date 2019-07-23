package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.Post;
import com.revature.repository.PostRepository;

public class PostService {
	@Autowired
	private PostRepository postRepo;
	
	public Post add(Post p) {
		return postRepo.save(p);
	}
}
