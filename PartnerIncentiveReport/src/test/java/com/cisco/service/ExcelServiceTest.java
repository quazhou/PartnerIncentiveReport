package com.cisco.service;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.cisco.action.PartnerIncentiveAction;

@ContextConfiguration("classpath:applicationContext.xml")
public class ExcelServiceTest extends AbstractJUnit4SpringContextTests {
	
	@Resource(name="excelService")
	private ExcelService excelService;
	
	@Test
	public void test() throws Exception{
		this.excelService.getExcelFile();
	}

}
