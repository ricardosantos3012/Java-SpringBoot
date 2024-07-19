package model;


import jakarta.persistence.*;

@Entity
@Table(name= "tab_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer id;
	@Column(length = 50, nullable = false)
	private String name;
	@Column(length = 20, nullable = false)
	private String userName;
	@Column(length = 100, nullable = false)
	private String password;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", userName='" + userName + '\'' +
				", password='" + password + '\'' +
				'}';
	}
	
}
