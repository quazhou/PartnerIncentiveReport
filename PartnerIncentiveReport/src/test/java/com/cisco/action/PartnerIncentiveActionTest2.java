package com.cisco.action;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration("classpath:applicationContext.xml")
public class PartnerIncentiveActionTest2 extends AbstractJUnit4SpringContextTests {
	
	@Resource(name="partner_incentive")
	private PartnerIncentiveAction parterIncentiveAction;
	
	@Test
	public void test() throws Exception {
		this.parterIncentiveAction.load();
	}

}
