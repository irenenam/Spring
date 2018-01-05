package com.springbook.spring.user;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springbook.spring.user.dao.ConnectionMaker;
import com.springbook.spring.user.dao.DConnectionMaker;
import com.springbook.spring.user.dao.DaoFactory;
import com.springbook.spring.user.dao.NUserDao;
import com.springbook.spring.user.dao.UserDao;
import com.springbook.spring.user.domain.User;

public class UserResouce {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//ConnectionMaker connectionMaker = new DConnectionMaker();
		//UserDao dao = new UserDao(connectionMaker);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class)	;
		//UserDao dao =  new DaoFactory().userDao();
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		//Singleton registry
		UserDao dao3 = context.getBean("userDao", UserDao.class);
		UserDao dao4 = context.getBean("userDao", UserDao.class);
		
		UserDao dao1 =  new DaoFactory().userDao();
		UserDao dao2 =  new DaoFactory().userDao();
		
		// objects are identical
		System.out.println(dao1);
		System.out.println(dao2);
		System.out.println(dao1 == dao2);
		
		// objects are equivalent
		System.out.println(dao3);
		System.out.println(dao4);
		System.out.println(dao3 == dao4);
		
		User user = new User();  
		user.setId("fabio");
		user.setName("Fabio");
		user.setPassword("1234");
		
		dao.add(user);
		
		
		System.out.println(user.getId() + " succeed to register");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user.getId() + " succeed to retrieve");
		
	}
}
