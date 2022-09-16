package springbook.user.main;

import java.sql.SQLException;

import springbook.user.dao.DaoFactory;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest{
	public static void main(String[] args)  throws ClassNotFoundException, SQLException {
		UserDao dao = new DaoFactory().userDao();
		
		User user = new User();
		user.setId("keaunsol");
		user.setName("나큰솔");
		user.setPassword("password");
		
		dao.add(user);
		
		System.out.println(user.getId() + " 등록 성공");
		
		User user2 = dao.get(user.getId());
		System.out.println(user2.getName());
//		
		System.out.println(user2.getPassword());
//		
		System.out.println(user2.getId() + " 등록 성공");
	}

}
