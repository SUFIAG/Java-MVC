package com.minimvc.project;

import java.util.List;





public interface DataAccessAdmin {
	//public List<User> getData(String sname,String uname,String pass,String cpass,int age,String email);//display all data 
	public List<User> getData(String name);
	public boolean isvalidforAdmin(String uname,String pass) ;	//for admin login
	public boolean isvalidforuser(String uname,String pass) ; //for user login
	public boolean  RegisterForm(String uname,String pass,String cpass,int age ,String email); 
	public boolean DeleteUser(String name); 
	public boolean UpdateUser(String sname,String uname,String pass,String cpass,int age,String email);
	
}
