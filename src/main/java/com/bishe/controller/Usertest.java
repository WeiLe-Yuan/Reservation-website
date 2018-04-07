package com.bishe.controller;

import java.io.IOException;
import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


import org.apache.log4j.lf5.util.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bishe.model.User;

@Controller
public class Usertest {
	@RequestMapping(value="/mysqltest")
	public String test(){
		try {
			String resource="classpath:spring-mybatis.xml";
			Reader reader=Resources.getResourceAsReader(resource);
			SqlSessionFactory sqlMapper = new SqlSessionFactoryBuilder().build(reader);
			SqlSession session=sqlMapper.openSession();
			User user = session.selectOne(
	                "com.bishe.model.UserMapper.selectUserByID", 1);
			System.out.println(user.getname());
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "usertest";
	}
}
