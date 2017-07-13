package xin.webtest.service;

public interface UserManager {
	boolean validLogin(String name, String password);
	
	boolean createUser(String name, String password);
}
