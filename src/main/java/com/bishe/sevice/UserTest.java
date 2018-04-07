package com.bishe.sevice;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bishe.dao.UserDao;
import com.bishe.dao.UserMapper;
import com.bishe.model.User;

public class UserTest {

	@Test
	public void test() {
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");  
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");  
        User user =userDao.selectUserByID(1);
        System.out.println(user.getname()); 
	}

}
