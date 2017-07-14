package xin.webtest.action;

import com.opensymphony.xwork2.ActionSupport;

import xin.webtest.service.UserManager;

public class LoginAction extends ActionSupport {
	private UserManager um;
	public void setUm(UserManager um){
		this.um = um;
	}
	
	private String name;
	private String password;
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return this.password;
	}
	
	public String execute() throws Exception{
		if(um.validLogin(getName(), getPassword())){
			addActionMessage("Success");
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
}
