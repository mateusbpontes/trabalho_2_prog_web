package ecommerce.core;

public class User {
	private int id;
	private String name;
	private String username;
	private String password;
	private boolean admin;

	public int getId() {
		return id;
	}
	public String getName() {
		return name;	
	}
	public String getUsername() {
		return username;	
	}
	public String getPassword() {
		return password;	
	}
	public boolean getAdmin() {
		return admin;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUsername(String username) {
		this.username = username;	
	}
	public void setPassword(String password) {
		this.password = password;	
	}
	public void setAdmin(Boolean admin) {
    this.admin = admin;	
	}
}
