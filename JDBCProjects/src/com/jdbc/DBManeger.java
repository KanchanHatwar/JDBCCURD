package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBManeger {
	
   private String MYSQLURL="jdbc:mysql://localhost:3306/jdbcpro";
   private String MYSQLPASSWORD="root";
   private String MYSQLUSERNAME="root";
   private String MYSQLDRIVER="com.mysql.cj.jdbc.Driver";
	public void selectRecord() {
		 
		try {
			
			 Class.forName(MYSQLDRIVER);
			 Connection connection=DriverManager.getConnection(MYSQLURL, MYSQLUSERNAME, MYSQLPASSWORD);
			 Statement st=connection.createStatement();
			 ResultSet rs=st.executeQuery("SELECT * FROM student");
			 
			 while(rs.next())
			 {
				 System.out.println("Student Data");
				 System.out.println("Student id :"+rs.getInt(1));
				 System.out.println("Student Name:"+rs.getString(2));
				 System.out.println(" Student Roll Number: "+rs.getInt(3));
				 System.out.println("Student Marks:  "+rs.getInt(4));
				 System.out.println("----------------------------------");
		//		 rs.close();
//			connection.close();
			
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		public boolean updateRecords(String Query)
		{
		boolean flag=false;
		try {
			
			Class.forName(MYSQLDRIVER);
			Connection connection=DriverManager.getConnection(MYSQLURL, MYSQLPASSWORD,MYSQLUSERNAME );
			Statement st=connection.createStatement();
		flag=st.executeUpdate(Query) >0  ? true : false;
		connection.close();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return flag;	
		}
	}
	

