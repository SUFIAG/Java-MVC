package com.minimvc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import com.jcp.mvc.User;

public class DataPersistaceAdmin implements DataAccessAdmin {

	/*
	 * @Override public List<user> getData(String user) { List<User> data =new *
	 * ArrayList();
	 * 
	 * 
	 * 
	 * 
	 * return data; }
	 */

	@Override
	public boolean isvalidforAdmin(String uname, String pass) {
		try {
			// jdbc code
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbadmin", "root", "toor");
			String Query = "select * from admin where user = ? and pass = ? ";
			PreparedStatement ps = conn.prepareStatement(Query);
			System.out.println(uname);
			System.out.println(pass);
			ps.setString(1, uname);
			ps.setString(2, pass);
			System.out.println(Query);
			ResultSet rs = ps.executeQuery();
			return rs.next();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean RegisterForm(String uname, String pass, String cpass, int age, String email) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webuser", "root", "toor");
			String query = "insert into user values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pass);
			ps.setString(3, cpass);
			ps.setInt(4, age);
			ps.setString(5, email);

			int count = ps.executeUpdate();
			if (count > 0) {
				System.out.println("record save in Databases");
				return true;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("driver(jar file ) not found !!!");

		} catch (SQLException e) {

			System.out.println("plz check the path .....");
		}

		return false;
	}

	@Override
	public boolean DeleteUser(String name) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webuser", "root", "toor");

			String query = "Delete from user where name = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			int count = 0;
			count = ps.executeUpdate();
			if (count != 0) {
				return true;
			}

		} catch (ClassNotFoundException e) {
			System.out.println("driver(jar file ) not found !!!");

		} catch (SQLException e) {

			System.out.println("plz check the path .....");
		}
		return false;
	}

	@Override
	public boolean UpdateUser(String sname, String uname, String pass, String cpass, int age, String email) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver install..");

			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webuser", "root", "toor");

			String query = "update user set Name = ?, Pass = ?, Cpass = ?, age = ?, Email = ? where Name= ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pass);
			ps.setString(3, cpass);
			ps.setInt(4, age);
			ps.setString(5, email);
			ps.setString(6, sname);
			ps.executeUpdate();
			return true;

		} catch (ClassNotFoundException e) {
			System.out.println("driver(jar file ) not found !!!");

		} catch (SQLException e) {

			System.out.println("plz check the path .....");
		}

		return false;
	}

	@Override
	public boolean isvalidforuser(String uname, String pass) {
		try {
			// jdbc code
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webuser", "root", "toor");
			String Query = "select * from user where Name = ? and pass = ? ";
			PreparedStatement ps = conn.prepareStatement(Query);
			System.out.println(uname);
			System.out.println(pass);
			ps.setString(1, uname);
			ps.setString(2, pass);
			System.out.println(Query);
			ResultSet rs = ps.executeQuery();
			return rs.next();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<User> getData(String name) {
		List<User> data = new ArrayList();
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webuser", "root", "toor");
			String query = "select * from user where name = ? ";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, name);
			System.out.println(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				System.out.println("result Set : ");
				User obj = new User();
				obj.setname(rs.getString(1));
				obj.setPass(rs.getString(2));
				obj.setCpass(rs.getString(3));
				obj.setAge(rs.getInt(4));
				obj.setEmail(rs.getString(5));
				data.add(obj);

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return data;
	}

}
