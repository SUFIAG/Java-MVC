package com.minimvc.project;

public class UserData {
	
	
	String suser;
	String user ;
	String pass;
	String cpass;	
	int age;
	String email;
	
	
	public UserData()
	{
		
	}

	public UserData(String su, String us,String  pa,String  cp,int a,String em)
	{
		this.suser=  su;
		this.user= us ;
		this.pass= pa;
		this.cpass=cp;	
		this.email= em;
		this.age=a;
			
	}

	public boolean UpdateUser()
	{
		boolean isupdate = true;
		DataAccessAdmin userupdate = new DataPersistaceAdmin();		
		isupdate = userupdate.UpdateUser(this.suser,this.user, this.pass,this.cpass,this.age,this.email);
		return isupdate;
	}
	
	
	
	
}
