package com.cisco.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.cisco.model.PartnerResult;
import com.cisco.model.UserInfo;
import com.cisco.service.PartnerIncentiveService;


public class DaoImplDemoTest {

	@Test
	public void test() throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DaoImplDemo did = (DaoImplDemo) context.getBean("daoImplDemo");
		UserInfo ui=new UserInfo();
		ui.setUserName("testName");
		did.save(ui);
	}

}
