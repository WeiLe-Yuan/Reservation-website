package com.bishe.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.bishe.model.User;

import junit.framework.TestCase;

public class UserDaoTest extends TestCase {

		@Test
		 public void test() throws IOException {
	        //
	        String resource = "mybatis-config.xml";
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
	                .build(inputStream);

	        SqlSession session = sqlSessionFactory.openSession();
	        try {

	            UserDao userdao = session.getMapper(com.bishe.dao.UserDao.class);
	            User user=userdao.selectUserByID(1);

	            System.out.print(user.getname());

	        }catch(Exception e){
	            System.out.print(e);
	        }
	        finally {
	            session.close();
	        }

	    }
	}

