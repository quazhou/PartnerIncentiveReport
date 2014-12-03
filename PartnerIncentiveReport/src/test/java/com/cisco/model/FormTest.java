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
		Field[] field = form.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组  
		StringBuffer sb=new StringBuffer("select * from partner_incentive_report");
		boolean flag = false;
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
                String name = field[j].getName();    //获取属性的名字
                //System.out.println("attribute name:"+name); 
                
                name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
                String type = field[j].getGenericType().toString();    //获取属性的类型
                
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
