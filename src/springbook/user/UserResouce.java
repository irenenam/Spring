package springbook.user;

import java.sql.SQLException;

import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.DaoFactory;
import springbook.user.dao.NUserDao;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserResouce {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//ConnectionMaker connectionMaker = new DConnectionMaker();
		//UserDao dao = new UserDao(connectionMaker);
		
		UserDao dao = new DaoFactory().userDao();
		
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
