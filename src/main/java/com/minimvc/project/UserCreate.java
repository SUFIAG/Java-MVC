package com.minimvc.project;

public class UserCreate {

	String name ;
	String pass ;
	int age;
	String cpass ;
	String email ;
	
	public UserCreate()
	{
		
	}
	
	public UserCreate(String nm,String pas,String cp,int ag,String em )
	{
		this.name=nm;
		this.pass=pas;
		this.age=ag;
		this.cpass=cp;
		this.email=em;
	}
	
	public boolean Createuser()
	{
		boolean isUserCreate = true;
		System.out.println("Layer 2 : userCreate ");
		DataAccessAdmin userCreate = new DataPersistaceAdmin();
		
		isUserCreate= userCreate.RegisterForm(this.name, this.pass, this.cpass, this.age, this.email);
		
		System.out.println("get input as boolean "+isUserCreate);
		return isUserCreate;
	}
	
}
