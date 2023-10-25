package com.minimvc.project;

public class Validation {
	
	
	String name ;
	String pass;
	
	
	public Validation()
	{
		
	}
	public Validation(String Us, String Pa) {
		this.name = Us;
		this.pass = Pa;
	}
	
	
	public boolean isValid()
	{
		boolean isadmin = true;
		DataAccessAdmin val = new DataPersistaceAdmin();		
		isadmin = val.isvalidforAdmin(this.name, this.pass);	
		return isadmin;
	}
}
