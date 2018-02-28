package com.stpl.login.dao;

import java.io.Serializable;
import java.util.List;

public interface LoginDaoInterface<T, Id extends Serializable, Pass extends Serializable > {
	
		public List<T> findById(Id id, Pass pass);
	}
