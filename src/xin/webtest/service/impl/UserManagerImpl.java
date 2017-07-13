package xin.webtest.service.impl;

import xin.webtest.dao.UserDao;
import xin.webtest.service.*;
import xin.webtest.domain.*;

import java.util.*;

public class UserManagerImpl implements UserManager {
	
	private UserDao userDao;
	public void setUserDao(UserDao userDao){
		this.userDao = userDao;
	}

	@Override
	public boolean validLogin(String name, String password) {
		if(userDao.findByNameAndPass(name, password).size() >= 1){
			return true;
		}
		else{
			return false;
		}
	}

	@Override
	public boolean createUser(String name, String password) {
		if(userDao.findByName(name) != null){
			return false;
		}
		else{
			User user = new User();
			user.setName(name);
			user.setPassword(password);
			userDao.save(user);
			return true;
		}
	}

}
