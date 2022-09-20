package springbook.user.dao;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springbook.user.domain.User;

public class UserDaoConnectionCountingTest {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(CountingDaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);
		
		
		CountingConnectionMaker con = context.getBean("connectionMaker", 
				CountingConnectionMaker.class);
		
		User user = new User();
		user.setId("keaunsol6");
		user.setName("나큰솔");
		user.setPassword("password");
		
		dao.add(user);
		
		System.out.println("Connection counter : " + con.getCounter());
	}
}
