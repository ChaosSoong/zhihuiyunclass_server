package com.hdky.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hdky.db.GetConn;

public class StudentInsert {
	public boolean insert(String sid,String spassword,String sname,String classes,String ssex,String sage) 
	{
		boolean b = false;
		GetConn getConn=new GetConn();
		ResultSet rs = null;
		Connection conn = getConn.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into Student values(?,?,?,?,?,?)");
			ps.setString(1,sid);
			ps.setString(2,spassword);
			ps.setString(3,sname);
			ps.setString(4,classes);
			ps.setString(5,ssex);
			ps.setString(6,sage);
			int i = ps.executeUpdate();
			if (i>0)
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
}
