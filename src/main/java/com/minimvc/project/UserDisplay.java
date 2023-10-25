package com.minimvc.project;

import java.util.List;



public class UserDisplay {

	public List<User> executeTheQuery(String name)
	{
		
		List<User> list ;
		DataAccessAdmin obj = new DataPersistaceAdmin ();
		list =obj.getData(name);
		
		return list;
		
	}
	
}
