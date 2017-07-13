package xin.webtest.dao.impl;

import java.util.List;

import xin.webtest.dao.UserDao;
import xin.webtest.domain.User;

public class UserDaoImpl extends BaseDaoImpl<User>
    implements UserDao{

	@Override
	public List<User> findByNameAndPass(String name, String password) {
		// TODO Auto-generated method stub
		return find("select p from User p where p.name=?0 and "
				+ "p.password=?1", name, password);
	}

	@Override
	public User findByName(String name) {
		// TODO Auto-generated method stub
		List<User> users = find("select e from User e where "
				+ "e.name=?0", name);
		if(users != null && users.size() > 1){
			return users.get(0);		
		}
		return null;
	}
	
}
