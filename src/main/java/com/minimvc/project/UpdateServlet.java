package com.minimvc.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String suser = request.getParameter("SearchUsername");
		String user = request.getParameter("Username");
		String pass = request.getParameter("Password");
		String cpass = request.getParameter("cPassword");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		PrintWriter pw =response.getWriter();
		 UserData u = new UserData(suser, user, pass, cpass,age,email);
		 System.out.println(suser);
		 System.out.println(user);
		 System.out.println(pass);
		 System.out.println(cpass);		
		 System.out.println(email);
		 if (u.UpdateUser()) {
				System.out.println("true");
				pw.println("True yes updated");
			} else {
				pw.println("false not update ");
			}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
