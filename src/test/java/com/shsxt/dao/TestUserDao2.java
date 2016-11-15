package com.shsxt.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shsxt.po.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class TestUserDao2 {
	
	@Resource
	private HibernateTemplate hibernateTemplate;
	
	@Test
	public 	void test(){
		User user = hibernateTemplate.get(User.class, 7);
		
		System.err.println(user);
		
	}

}
