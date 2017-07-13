package xin.webtest.dao;

import java.util.*;
import xin.webtest.domain.User;

public interface UserDao extends BaseDao<User> {
	List<User> findByNameAndPass(String name, String password);
	
	User findByName(String name);
}
