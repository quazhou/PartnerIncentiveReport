package com.cisco.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.model.PartnerResult;
import com.cisco.model.UserInfo;

public class ServiceTest {

	@Test
	public void test() throws Exception{
		UserInfo user=new UserInfo();
		user.setUserName("testService1");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Service service = (Service) context.getBean("service");
		service.save(user);
	}

}
