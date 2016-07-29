package com.hdky.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.hdky.daoimp.ManagerImp;
import com.hdky.daoimp.StudentImp;
import com.hdky.daoimp.TeacherImp;
import com.hdky.tool.MessageUtil;

public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String juese=request.getParameter("juese");
		
		if("1".equals(juese)){
			StudentImp s = new StudentImp();
			boolean flag=false;
			flag=s.login(username,password);
			out.print(flag);
		}
		if ("2".equals(juese)) {
			TeacherImp t = new TeacherImp();
			boolean flag=false;
			flag=t.login(username,password);
			out.print(flag);
		}
		if ("3".equals(juese)) {
			ManagerImp m = new ManagerImp();
			boolean flag=false;
			flag=m.login(username,password);
			out.print(flag);
		}	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		this.doGet(request, response);
	}
}
