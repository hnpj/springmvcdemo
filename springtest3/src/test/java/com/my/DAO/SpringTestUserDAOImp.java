package com.my.DAO;

import java.util.Date;
import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.my.xml.User;

/**
 * @author tydic
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:ContextLoaderListener.xml") 
public class SpringTestUserDAOImp extends AbstractJUnit4SpringContextTests  {
	@Resource (name="userDao")   
	private UserDAO userDao;
	  
		/**
		 * 
		 */
		@Test
		public void saveTest(){ 
		User user = new User();   
		user.setId(2);
		setUser(user);
		
		userDao.insertUser(user);
		
		}

		private void setUser(User user) {
			user.setBirthday(new Date());
			user.setName("tom");
		}
		
		
	
}
