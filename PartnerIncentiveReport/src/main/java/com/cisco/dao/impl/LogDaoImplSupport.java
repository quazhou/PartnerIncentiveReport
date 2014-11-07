package com.cisco.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.cisco.dao.LogDao;
import com.cisco.model.Log;

public class LogDaoImplSupport extends HibernateDaoSupport implements LogDao{
	public void save (Log log){
		this.getHibernateTemplate().save(log);
	}
}
