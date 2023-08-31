package com.bri8.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.bri8.dao.UserDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/auth-servlet")
public class AuthServlet extends jakarta.servlet.http.HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String action = request.getParameter("action");
		if(action.equals("login")) {
			doLogin(request, response, out);
		}else if(action.equals("register")) {
			doRegister(request, response, out);
		}
	}

	private void doLogin(HttpServletRequest request, HttpServletResponse response, PrintWriter out) {
		String enteredUsername = request.getParameter("username");
		String enteredPassword = request.getParameter("password");

		try {
			String found = new UserDAO().isUserFound(enteredUsername, enteredPassword);
			if(found!=null) {
			    request.setAttribute("username", found);
			    request.getRequestDispatcher("dashboard.jsp").forward(request, response);
			} else {
			    out.println("<h2>Invalid credentials. Please try again.</h2>");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h2>Error accessing database.</h2>"+ e.getMessage());
		}
	}
	
	
	private void doRegister(HttpServletRequest request, HttpServletResponse response, PrintWriter out) {
		String enteredUsername = request.getParameter("username");
		String enteredPassword = request.getParameter("password");
		String enteredName = request.getParameter("name");

		try {
			String addedName = new UserDAO().addUser(enteredUsername, enteredPassword, enteredName);
			if(addedName!=null) {
			    request.setAttribute("username", addedName);
			    out.println("<h2>added user.</h2>" + addedName);
			} else {
			    out.println("<h2>Invalid registration. Please try again.</h2>");
			}

			
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h2>Error accessing database.</h2>"+ e.getMessage());
		}
	}
	
}
