package com.hdky.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdky.daoimp.StudentInsert;
import com.hdky.daoimp.TeacherInsert;

public class Student extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("sid");
		String spassword = request.getParameter("spassword");
		String sname = request.getParameter("sname");
		String classes = request.getParameter("classes");
		String ssex = request.getParameter("ssex");
		String sage = request.getParameter("sage");	
		StudentInsert t= new StudentInsert();
		t.insert(sid, spassword, sname,classes,ssex,sage);
		out.flush();
		out.close();
	}	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			this.doGet(request, response);	
	}
}
