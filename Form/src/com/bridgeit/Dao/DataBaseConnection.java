package com.bridgeit.Dao;

import java.sql.*;
//import java.sql.PreparedStatement;

public class DataBaseConnection {
 
	Connection connection;
	PreparedStatement preparedStatement;
	public void insert(String name,String email,String pass,String DOB) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
			preparedStatement=connection.prepareStatement("insert into UserDataBase values(?,?,?,?)");
			preparedStatement.setString(1,name);
			preparedStatement.setString(2,email);
			preparedStatement.setString(3, pass);
			preparedStatement.setString(4,DOB);
			int i=preparedStatement.executeUpdate();
			System.out.println(i+" record affected");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	public void Retrive() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","root");
			preparedStatement=connection.prepareStatement("select * from UserDataBase where email=? and password=?");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
