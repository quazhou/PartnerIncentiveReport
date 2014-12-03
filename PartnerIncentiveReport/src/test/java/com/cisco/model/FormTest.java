package com.cisco.model;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

import org.junit.Test;

import com.cisco.dto.Form;

public class FormTest {
	
	@Test
	public void test() throws Exception {
		Form form=new Form();
		System.out.println(form.getClawbackPeriod());
		form.setYear("2014");
		form.setQuarter("Q1");
		Field[] field = form.getClass().getDeclaredFields();        //��ȡʵ������������ԣ�����Field����  
		StringBuffer sb=new StringBuffer("select * from partner_incentive_report");
		boolean flag = false;
        for(int j=0 ; j<field.length ; j++){     //������������
                String name = field[j].getName();    //��ȡ���Ե�����
                //System.out.println("attribute name:"+name); 
                
                name = name.substring(0,1).toUpperCase()+name.substring(1); //�����Ե����ַ���д�����㹹��get��set����
                String type = field[j].getGenericType().toString();    //��ȡ���Ե�����
                
                Method m = form.getClass().getMethod("get"+name);
                Object value = m.invoke(form);
                
                if(value != null){
                	if(flag==false){
            			sb.append(" where "+name+"=?");
            			flag=true;
            		}
                	else{
                		sb.append(" and "+name+"=? ");
                	}
                }
               
        }
        
        System.out.println(sb.toString());

        
	}

}
