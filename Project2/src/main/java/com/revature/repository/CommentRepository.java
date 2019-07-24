package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.beans.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {

}
