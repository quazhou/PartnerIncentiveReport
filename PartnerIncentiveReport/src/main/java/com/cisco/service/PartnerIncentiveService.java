package com.cisco.service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cisco.util.DB;

import com.cisco.dto.Form;
import com.cisco.model.*;
@Service("partner_incentive_service")
public class PartnerIncentiveService {
	
	public List<PartnerResult> load() throws SQLException{
		ArrayList<PartnerResult> al=new ArrayList<PartnerResult>();
		Connection conn=DB.getConn();
		String sql="select * from partner_incentive_report where quarter=?";
		PreparedStatement ps=DB.getstat(conn, sql);
		ResultSet rs=null;
		String quarter="";
		try {
			ps.setString(1, "Q1");
			rs=ps.executeQuery();
			if(rs.next()){
				PartnerResult pr=new PartnerResult();
				quarter=rs.getString(1);
				pr.setQuarter(quarter);
				pr.setYear(rs.getString(2));
				pr.setClawbackPeriod(rs.getInt(3));
				al.add(pr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw(e);
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
		return al;
	}
	
	public List<PartnerResult> load(Form form) throws Exception{
		ArrayList<PartnerResult> al=new ArrayList<PartnerResult>();
		Connection conn=DB.getConn();
		String sql=getSQL(form);
		PreparedStatement ps=DB.getstat(conn, sql);
		ResultSet rs=null;
		try {
			ps=prepareSQL(ps, form);
			rs=ps.executeQuery();
			while(rs.next()){
				PartnerResult pr=new PartnerResult();
				pr.setQuarter(rs.getString(1));
				pr.setYear(rs.getString(2));
				pr.setClawbackPeriod(rs.getInt(3));
				pr.setIarrRebateTermMultiplier(rs.getInt(4));
				pr.setIarrRebatePercentage(rs.getDouble(5));
				pr.setIarrPartnerRebateThreshold(rs.getDouble(6));
				pr.setLifeRebatePercentageThreshold(rs.getDouble(7));
				pr.setLifeRebateTermMultiplier(rs.getInt(8));
				pr.setLifeRebatePercentage(rs.getDouble(9));
				al.add(pr);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw(e);
		}
		DB.close(rs);
		DB.close(ps);
		DB.close(conn);
		return al;
	}
	
	public String getSQL(Form form){
		Field[] field = form.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组  
		StringBuffer sb=new StringBuffer("select * from partner_incentive_report");
		boolean flag = false;
        for(int j=0 ; j<field.length ; j++){     //遍历所有属性
                String name = field[j].getName();    //获取属性的名字
                //System.out.println("attribute name:"+name); 
                
                name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
                String type = field[j].getGenericType().toString();    //获取属性的类型
                
                Object value=null;
				try {
					Method m = form.getClass().getMethod("get"+name);
					value = m.invoke(form);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
                
        return sb.toString();
	}
	
	public PreparedStatement prepareSQL(PreparedStatement ps,Form form) throws Exception{
		Field[] field = form.getClass().getDeclaredFields();        //获取实体类的所有属性，返回Field数组  
		StringBuffer sb=new StringBuffer("select * from partner_incentive_report");
		int i=1;
		for(int j=0 ; j<field.length ; j++){     //遍历所有属性
        String name = field[j].getName();    //获取属性的名字
        //System.out.println("attribute name:"+name); 
        
        name = name.substring(0,1).toUpperCase()+name.substring(1); //将属性的首字符大写，方便构造get，set方法
        String type = field[j].getGenericType().toString();    //获取属性的类型

        if(type.equals("class java.lang.String")){   //如果type是类类型，则前面包含"class "，后面跟类名
            Method m = form.getClass().getMethod("get"+name);
            String value = (String) m.invoke(form);    //调用getter方法获取属性值
            if(value != null){
            	ps.setString(i, value);
            	i++;
            }
        }
        else if(type.equals("class java.lang.Integer")){     
            Method m = form.getClass().getMethod("get"+name);
            Integer value = (Integer) m.invoke(form);
            if(value != null){
            	ps.setInt(i, value);
            	i++;
            }
        }
        else if(type.equals("class java.lang.Short")){     
            Method m = form.getClass().getMethod("get"+name);
            Short value = (Short) m.invoke(form);
            if(value != null){
            	ps.setShort(i, value);
            	i++;
            }
        }       
        else if(type.equals("class java.lang.Double")){     
            Method m = form.getClass().getMethod("get"+name);
            Double value = (Double) m.invoke(form);
            if(value != null){                    
            	ps.setDouble(i, value);
            	i++;
            }
        }                  
        else if(type.equals("class java.lang.Boolean")){
            Method m = form.getClass().getMethod("get"+name);    
            Boolean value = (Boolean) m.invoke(form);
            if(value != null){                      
            	ps.setBoolean(i, value);
            	i++;
            }
        }
        else if(type.equals("class java.util.Date")){
            Method m = form.getClass().getMethod("get"+name);                    
            Date value = (Date) m.invoke(form);
            if(value != null){
            	if(value != null){                      
                	ps.setDate(i, value);
                	i++;
                }
            }
        } 
        }
		return ps;
	}
	
}
