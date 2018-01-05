package com.springbook.spring.user.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/*
public class DaoFactory {
	public UserDao userDao() {
		ConnectionMaker connectionMaker = new DConnectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
}
*/
@Configuration  //application context or the setting information of usable for bean factory. 
public class DaoFactory {
	@Bean  
	public UserDao userDao() {
		UserDao userDao = new UserDao();
		userDao.setDataSouce(dataSource());
		return userDao;
	}
	
	@Bean 
	public DataSource dataSource() {
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
		
		dataSource.setDriverClass(org.postgresql.Driver.class);
		dataSource.setUrl("jdbc:postgresql://localhost/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres");
		
		return dataSource;
	}
}