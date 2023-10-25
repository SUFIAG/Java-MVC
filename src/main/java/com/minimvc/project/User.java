package com.minimvc.project;

public class User {
	String name;
	String Password;
	String Cpass;
	int age;
	String email;
	
	public User()
	{
		
	}
	public User(String name  ,String pass,String cpass ,int age,String email)
	{
		this.name=name ;
		this.Password= pass;
		this.Cpass=cpass;
		this.age=age;
		this.email=email;
		
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getname() {
		return name;
	}
	public void setname(String user) {
		this.name = user;
	}
	public String getPass() {
		return Password;
	}
	public void setPass(String pass) {
		Password = pass;
	}
	public String getCpass() {
		return Cpass;
	}
	public void setCpass(String cpass) {
		Cpass = cpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
