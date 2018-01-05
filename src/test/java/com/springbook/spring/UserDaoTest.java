package com.springbook.spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.springbook.spring.user.dao.UserDao;
import com.springbook.spring.user.domain.User;

public class UserDaoTest {
	public static void main(String args[]) throws SQLException, ClassNotFoundException {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		User user = new User();
		user.setId("user");
		user.setName("Max");
		user.setPassword("Bong");
		
		dao.add(user);
		
	
		System.out.println(user);
		
	}
}
