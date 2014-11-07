package com.cisco.dao.impl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cisco.dao.LogDao;
import com.cisco.model.Log;

@Repository("logDaoimpl")
public class LogDaoImpl implements LogDao{
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Override
	public void save(Log log){
		Session session=sessionFactory.getCurrentSession();
		session.save(log);
	}
}
