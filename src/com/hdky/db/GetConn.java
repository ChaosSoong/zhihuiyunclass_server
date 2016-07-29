package com.hdky.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConn {
	public static final String url = "jdbc:mysql://localhost:3306/Zhihui";  
    public static final String name = "com.mysql.jdbc.Driver";  
    public static final String user = "root";  
    public static final String password = "199251"; 
       public Connection getConn() 
		{ 
			Connection conn = null;
			try {
				Class.forName(name);
				conn=DriverManager.getConnection(url, user, password);
			} catch (Exception e) {	
				e.printStackTrace();
			}   	
			return conn;
		}
//		public void closeconn(Connection connection)
//		{  	 
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
		

}
