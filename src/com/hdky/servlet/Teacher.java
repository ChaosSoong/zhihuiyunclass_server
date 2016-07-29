package com.hdky.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hdky.daoimp.TeacherInsert;
import com.hdky.tool.MessageUtil;

public class Teacher extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String tid = request.getParameter("tid");
		String tpassword = request.getParameter("tpassword");
		String tname = request.getParameter("tname");
		String classes = request.getParameter("classes");
		String tsex = request.getParameter("tsex");
		String tage = request.getParameter("tage");
		
		
		
		TeacherInsert t= new TeacherInsert();
		t.insert(tid, tpassword, tname,classes,tsex,tage);
		//out.print(tid+","+tpassword+","+tname+","+classes+","+tage+","+tage);
		
		out.flush();
		out.close();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
