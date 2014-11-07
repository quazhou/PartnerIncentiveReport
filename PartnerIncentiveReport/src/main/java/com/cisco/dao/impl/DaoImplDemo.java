package com.cisco.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.cisco.model.UserInfo;

@Component("daoImplDemo")
public class DaoImplDemo {
	
	HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource(name="hibernateTemplate")
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private SessionFactory sessionFactory;
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private DataSource dataSource; 

	public DataSource getDataSource() {
		return dataSource;
	}
	
	@Resource(name="dataSourceMySQL")
	public void setDataSource(DataSource datasource) {
		this.dataSource = datasource;
	}
	
	public void save(UserInfo userInfo) throws SQLException{
//		Connection conn=dataSource.getConnection();
//		PreparedStatement ps=conn.prepareStatement("insert into user(name) values('lilei')");
//		ps.executeUpdate();
//		ps.close();
//		conn.close();
		/*try{
			Session s= sessionFactory.getCurrentSession();
			s.save(userInfo);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("user saved!");*/
		hibernateTemplate.save(userInfo);
	}
}
