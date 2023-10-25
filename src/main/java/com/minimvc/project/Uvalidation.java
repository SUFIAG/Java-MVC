package com.minimvc.project;

public class Uvalidation {
	
	String name ;
	String pass;
	
	
	public Uvalidation()
	{
		
	}
	public Uvalidation(String Us, String Pa) {
		this.name = Us;
		this.pass = Pa;
	}
	
	
	public boolean isvalidforUser()
	{
		boolean isadmin = true;
		DataAccessAdmin val = new DataPersistaceAdmin();		
		isadmin = val.isvalidforuser(this.name, this.pass);	
		return isadmin;
	}
}
