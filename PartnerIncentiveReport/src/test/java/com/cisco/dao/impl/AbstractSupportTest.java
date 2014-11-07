package com.cisco.dao.impl;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cisco.model.Log;
import com.cisco.model.UserInfo;

public class AbstractSupportTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		LogDaoImplSupport ldis = (LogDaoImplSupport) context.getBean("logDaoImplSupport");
		Log log=new Log();
		log.setMsg("test dao support");
		ldis.save(log);
	}

}
