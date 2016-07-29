package com.hdky.daoimp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hdky.db.GetConn;

public class StudentImp {
	
	public boolean login(String username,String password) 
	{
		boolean b = false;
		GetConn getConn=new GetConn();
		ResultSet rs = null;
		PreparedStatement ps=null;
		Connection conn = getConn.getConn();
		try {
			String sql="select sid,spassword from Student where sid="+username+" and spassword="+password;
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			if (rs.next())
			{
				b=true;
			}
			else
			{
				b=false;
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
	}
}
