package com.cisco.action;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JsonJqueryStruts2ActionTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		JsonJqueryStruts2Action j = (JsonJqueryStruts2Action) context.getBean("JsonJqueryStruts2Action");
        System.out.println(j.returnList());
	}

}
