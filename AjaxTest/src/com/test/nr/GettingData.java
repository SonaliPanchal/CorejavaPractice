package com.test.nr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GettingData
 */
//@WebServlet("/GettingData")
public class GettingData extends HttpServlet {
	private static final long serialVersionUID = 1L;




	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//PrintWriter out = response.getWriter();
		 response.setContentType("text/html");
		 response.setCharacterEncoding("UTF-8");
		String address = null;
		String userName = request.getParameter("userName");
		System.out.println("hit..");
		try {

			if(userName!=null && userName!="")
			{
				address = "Ujjain";
			}
			else 
			{
				address ="user is no avialable";
			}
			

		} catch (Exception e) {
			e.printStackTrace();
			 response.getWriter().write("fail");

		}
		 response.getWriter().write(address);
	}

}
