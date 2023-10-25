package com.minimvc.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserCreate
 */
@WebServlet("/Create")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("Username");
		String pass = request.getParameter("Password");
		String cpass=request.getParameter("cPassword");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		PrintWriter pw =response.getWriter();
		UserCreate c = new UserCreate(name, pass, cpass, age, email);
		System.out.println("Layer 1 : Create Servlet : ");
		if(c.Createuser())
		{
			System.out.println("true");
			pw.println("user Created..");
		}
		else
		{
			System.out.println("false");
			pw.println("invalid input");
		}
		
	}

}
