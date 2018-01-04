package springbook.user.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
		return new UserDao(connectionMaker());
	}
	
	@Bean 
	public ConnectionMaker connectionMaker() {
		return new DConnectionMaker();
	}
}