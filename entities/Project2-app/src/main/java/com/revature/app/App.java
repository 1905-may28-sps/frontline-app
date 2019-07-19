package com.revature.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.revature.beans.FUser;
import com.revature.repository.UserRepository;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserRepository repo = (UserRepository) context.getBean(UserRepository.class);
		FUser u = repo.getById(1);
		System.out.println(u);
	}

}
