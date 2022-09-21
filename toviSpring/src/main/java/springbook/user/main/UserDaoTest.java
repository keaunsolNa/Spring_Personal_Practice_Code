package springbook.user.main;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import springbook.user.dao.UserDao;
import springbook.user.domain.User;

public class UserDaoTest{
	
	@Test
	public void addAndGet()  throws SQLException, ClassNotFoundException {
		ApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		UserDao dao = context.getBean("userDao", UserDao.class);
		User user = new User();
		user.setId("keaunsl165");
		user.setName("나큰솔");
		user.setPassword("password");
		
		dao.add(user);
		
		User user2 = dao.get(user.getId());
		
		assertThat(user2.getName(), is(user.getName()));
		assertThat(user2.getPassword(), is(user.getPassword()));
	}

}
