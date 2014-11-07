package com.cisco.action;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class PartnerIncentiveActionTest {

	@Test
	public void testLoad() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PartnerIncentiveAction pis = (PartnerIncentiveAction) context.getBean("partner_incentive");
        pis.load();
	}

}
