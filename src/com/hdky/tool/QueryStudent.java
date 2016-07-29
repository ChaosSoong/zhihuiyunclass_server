package com.hdky.tool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdky.db.GetConn;
import com.hdky.model.Student;
import com.mysql.jdbc.PreparedStatement;

public class QueryStudent {
	public List<Student> selectMessage ()
	{
		List<Student> list=new ArrayList<Student>();
		GetConn getConn=new GetConn();	
		Connection conn=getConn.getConn();
		try {
			PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select * from Student");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
				Student msg=new Student();
				msg.setSid(rs.getString(1));
				msg.setTpassword(rs.getString(2));
				msg.setTname(rs.getString(3));
				msg.setClassse(rs.getString(4));
				msg.setTsex(rs.getString(5));
				msg.setTage(rs.getInt(6));
				
				list.add(msg);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

}
