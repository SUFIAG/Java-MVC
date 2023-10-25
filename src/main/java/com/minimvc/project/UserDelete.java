package com.minimvc.project;

public class UserDelete {

	String suser;
	
	public UserDelete()
	{
		
	}
	
	public UserDelete(String nm)
	{
		this.suser=nm;
	}
	
	
	
	public boolean DeleteUser()
	{
		boolean isdelete =true;
		DataAccessAdmin userDelete = new DataPersistaceAdmin();
		isdelete = userDelete.DeleteUser(this.suser);
		return isdelete;
	}
	
	
}
