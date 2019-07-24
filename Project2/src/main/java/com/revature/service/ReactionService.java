package com.revature.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.revature.beans.Reaction;
import com.revature.repository.ReactionRepository;

public class ReactionService {
	
	@Autowired
	ReactionRepository reactRepo;
	
	public Reaction add(Reaction r) {
		return reactRepo.save(r);
	}

}
