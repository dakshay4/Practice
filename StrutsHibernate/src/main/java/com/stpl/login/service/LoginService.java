package com.stpl.login.service;
import java.util.List;

import com.stpl.login.dao.impl.LoginDao;
import com.stpl.login.model.User;

public class LoginService {
	LoginDao loginDao = null;
	public LoginService(){
		loginDao = new LoginDao();
	}
	
	public List<User> findById(String Id, String Pass){
		List<User> login = loginDao.findById(Id, Pass);
		return login;
	}
	
}
