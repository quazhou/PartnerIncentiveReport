package com.cisco.service;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.cisco.action.PartnerIncentiveAction;
import com.cisco.dto.Form;
import com.cisco.model.PartnerResult;

@ContextConfiguration("classpath:applicationContext.xml")
public class PartnerIncentiveServiceTest extends AbstractJUnit4SpringContextTests{
	
	
	@Resource(name="partner_incentive_service")
	private PartnerIncentiveService partnerIncentiveService;
	
	@Test
	public void test() throws Exception{
		Form form=new Form();
		form.setYear(2014);
		form.setQuarter("Q1");
		form.setClawbackPeriod(90);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PartnerIncentiveService pis = (PartnerIncentiveService) context.getBean("partner_incentive_service");
		List<PartnerResult> al=pis.load(form);
		System.out.println(al.get(0).getYear());
	}
	
	@Test 
	public void testGetSQL(){
		System.out.println("hello");
		Form form=new Form();
		form.setYear(2014);
		form.setQuarter("Q1");
		//form.setClawbackPeriod(1);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PartnerIncentiveService pis = (PartnerIncentiveService) context.getBean("partner_incentive_service");
		String al=pis.getSQL(form);
		
		System.out.println(form.getClawbackPeriod());
		System.out.println(al);
	}
	
	@Test
	public void testLoad() throws Exception{
		Form form=new Form();
		List<PartnerResult> pr=partnerIncentiveService.load(form);
		System.out.println(pr.size());
		JSONArray rows=JSONArray.fromObject(pr);
		System.out.println(rows);
	}

}
