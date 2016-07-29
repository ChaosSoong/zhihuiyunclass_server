package com.hdky.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hdky.db.GetConn;

public class TeacherInsert {
	public boolean insert(String tid,String tpassword,String tname,String classes,String tsex,String tage) 
	{
		boolean b = false;
		GetConn getConn=new GetConn();
		ResultSet rs = null;
		Connection conn = getConn.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into Teacher values(?,?,?,?,?,?)");
			ps.setString(1,tid);
			ps.setString(2,tpassword);
			ps.setString(3,tname);
			ps.setString(4,classes);
			ps.setString(5,tsex);
			ps.setString(6,tage);
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
