package com.revature.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.beans.Post;
import com.revature.repository.PostRepository;
import com.revature.repository.ReportRepository;

@Service
public class PostService {
	@Autowired
	PostRepository postRepo;
	@Autowired
	ReportRepository repRepo;
	
	public Post add(Post p) {
		return postRepo.save(p);
	}
	public List<Post> getAllSafe(){
		List<Post> safePost=new ArrayList<>();
		List<Post> hold=postRepo.findAll();
		for(int i=0;i<hold.size();i++) {
		if(repRepo.findByPost(hold.get(i)).isEmpty()) {
			
			System.out.println(hold.get(i));
			safePost.add(hold.get(i));
		}else {System.out.println(hold.get(i) +"this is null");}
		}
		return safePost;
	}
	
//	public List<Post> getAll(){
//		return postRepo.findAll();
//	}
}
