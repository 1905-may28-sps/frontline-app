package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Post;


@Transactional
@Repository
	
public interface PostRepository extends JpaRepository<Post, Integer>{
	List<Post> findByBodyContainingIgnoreCaseOrBodyContainingIgnoreCase(String keyword1, String keyword2);

	List<Post> findByTitleContainingIgnoreCaseOrBodyContainingIgnoreCase(String keyword1, String keyword2);

	}