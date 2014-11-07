package com.cisco.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cisco.dao.LogDao;
import com.cisco.dao.impl.DaoImplDemo;
import com.cisco.dao.impl.LogDaoImpl;
import com.cisco.model.Log;
import com.cisco.model.UserInfo;


@Component("service")
public class Service {
	private int i=0;
	private DaoImplDemo daoImpl;
	private LogDao logDao;
	
	public DaoImplDemo getDaoImpl() {
		return daoImpl;
	}

	public int getI() {
		return i;
	}
	public LogDao getLogDao() {
		return logDao;
	}
	
	public UserInfo get(int id){
		return null;
	}
	
	//@Transactional
	public void save(UserInfo userInfo) throws Exception{
		daoImpl.save(userInfo);
		Log log =new Log();
		log.setMsg("save user");
		logDao.save(log);
	}
	
	
	@Resource(name="daoImplDemo")
	public void setDaoImpl(DaoImplDemo daoImpl) {
		this.daoImpl = daoImpl;
	}

	public void setI(int i) {
		this.i = i;
	}
	
	@Resource(name="logDaoimpl")
	public void setLogDao(LogDao logDao) {
		this.logDao = logDao;
	}
	
}
