package com.hdky.tool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hdky.db.GetConn;

public class MessageUtil {
	public boolean insert(String title,String text,String time) 
	{
		boolean b = false;
		GetConn getConn=new GetConn();
		ResultSet rs = null;
		Connection conn = getConn.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement("insert into Message values(?,?,?)");
			ps.setString(1,title);
			ps.setString(2,text);
			ps.setString(3,time);
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
