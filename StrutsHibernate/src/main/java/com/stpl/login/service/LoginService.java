package com.stpl.login.service;
import java.util.List;

import com.stpl.login.dao.LoginDao;
import com.stpl.login.model.Login;

public class LoginService {
	LoginDao loginDao = null;
	public LoginService(){
		loginDao = new LoginDao();
	}
	
	public List<Login> findById(Integer Id, String Pass){
		List<Login> login = loginDao.findById(Id, Pass);
		return login;
	}
	
}
