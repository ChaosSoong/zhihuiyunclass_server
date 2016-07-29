package com.hdky.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hdky.db.GetConn;

public class TeacherImp {
	public boolean login(String username,String password) 
	{
		boolean b = false;
		GetConn getConn=new GetConn();
		ResultSet rs = null;
		Connection conn = getConn.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement("select * from Teacher where tid=? and tpassword=?");
			ps.setString(1,username);
			ps.setString(2,password);
			rs=ps.executeQuery();
			if (rs.next())
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return b;
	}

//	public static void main(String[] args) {
//	String username="123",password="123";
//	TeacherImp t = new TeacherImp();
//	System.out.println(t.login(username,password));
//}
}
