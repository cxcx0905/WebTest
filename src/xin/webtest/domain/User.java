package xin.webtest.domain;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="user_inf")
public class User implements Serializable {
	private static final long serialVersionUID = 48L;
	
	@Id @Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="user_name", nullable=false, length=50, unique=true)
	private String name;
	@Column(name="user_pass", nullable=false, length=50)
	private String password;
	
	public User(){
	}
	
	public User(Integer id, String name, String password){
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId(){
		return this.id;
	}
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
	
	public int hashCode(){
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null)? 0 : name.hashCode());
		result = prime * result + ((password == null)? 0 : password.hashCode());
		return result;
	}
	
	public boolean equals(Object obj){
		if(this == obj){
			return true;
		}
		if(obj == null){
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		User other = (User)obj;
		if(name == null){
			if(other.name != null){
				return false;
			}
		}
		else if(!name.equals(other.name)) return false;
		if(password == null){
			if(other.password != null){
				return false;
			}
		}
		else if(!password.equals(other.password)) return false;
		
		return true;
	}
	
}
