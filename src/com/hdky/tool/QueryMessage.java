package com.hdky.tool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hdky.db.GetConn;
import com.hdky.model.Message;
import com.mysql.jdbc.PreparedStatement;

public class QueryMessage {
		public List<Message> selectMessage ()
		{
			List<Message> list=new ArrayList<Message>();
			GetConn getConn=new GetConn();	
			Connection conn=getConn.getConn();
			try {
				PreparedStatement ps=(PreparedStatement) conn.prepareStatement("select * from Message");
	            ResultSet rs = ps.executeQuery();
	            while (rs.next()) 
	            {
					Message msg=new Message();
					msg.setTime(rs.getString(1));
					msg.setTitle(rs.getString(2));
					msg.setText(rs.getString(3));
					list.add(msg);
				}			
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}	
	}
	
