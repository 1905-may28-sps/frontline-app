package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.User;

@Transactional
@Repository
public interface LoginRepository extends JpaRepository<User, Integer> {

	User findByUsernameLikeIgnoreCaseAndPassword(String username, String password);
	
	
	
}
