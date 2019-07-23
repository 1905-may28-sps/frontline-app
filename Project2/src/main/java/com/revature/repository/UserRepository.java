    
package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.User;


/*
 * @Transactional - we need this annotation to indicate
 * that the TX manager should be used here, and to manage
 * our transactions. This annotation can be applied to 
 * classes, as well as methods to provide more information
 * on how you want your transactions to be managed
 * 
 * @Repository - annotate classes at the persistence 
 * layer, which will act as a DB repository, but it is
 * not necessary
 */

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	
	

}