package com.stpl.dao;

import java.io.Serializable;
import java.util.List;

import com.stpl.model.User;

public interface UserDao<T,Id extends Serializable, Pwd extends Serializable> {
	public List<User> findById(String Id, String Pwd);
}
