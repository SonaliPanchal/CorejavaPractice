package com.test.nr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Register() {
        super();
    }

	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
*/
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String n= null;
		String p=null;
		String e=null;
		String c=null;
	
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		try {
			
			 n=request.getParameter("userName");  
			 p=request.getParameter("userPass");  
			 e=request.getParameter("userEmail");  
			 //c=request.getParameter("userCountry");  
			 c="heloo";
					
		} 
		catch (Exception e1) {
			e1.printStackTrace();
			out.print("no able to getting data ");
			
		}          
		
		//out.print("getting data successfully");
		out.println(c);
		System.out.println("Country"+c);
		RequestDispatcher rd = request.getRequestDispatcher("/GetData.jsp");
		rd.forward(request, response);
		//response.setContentType("text/html");  
		//response.sendRedirect("GetData.jsp");
		//response.sendRedirect("http://www.google.com");
		
	}

}
