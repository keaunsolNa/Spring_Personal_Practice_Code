package springbook.user.main;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest{
	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		ApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		UserDao dao = context.getBean("userDao", UserDao.class);
		UserDao dao2 = context.getBean("userDao", UserDao.class);
		
		System.out.println(dao == dao2);
		User user = new User();
		user.setId("keaunsol65");
		user.setName("나큰솔");
		user.setPassword("password");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
		System.out.println(user2.getPassword());
		System.out.println(user2.getId() + " 등록 성공");
	}

}
