package com.bishe.model;

public class User {
	private int user_id;
	private String user_name;
	private String user_password;
		
	
	public int getid() {
		return user_id;
	}
	
    public void setid(int id) {
		this.user_id=id;
	}
	
	public String getname(){
		return user_name;
	}
	
	public void setname(String name) {
		this.user_name=name;
	}
	
	public String getpassword(){
		return user_password;
	}
	
	public void setpassword(String password) {
		this.user_password=password;
	}
	

}
