package jdbc;

import java.sql.*;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class PreperedStatement {
	Scanner sc=new Scanner(System.in);
	Connection cn;
    Statement st;
    ResultSet rs;
	 public void  insert() {     
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satkar","root","root");
				PreparedStatement pr=cn.prepareStatement("insert into persons values(?,?,?,?,?)");
	            System.out.println("Enter the name of person");
				pr.setString(1,sc.next()); 
				System.out.println("enter the age of person");
	            pr.setInt(2,sc.nextInt());
	            System.out.println("enter the city of person");
	            pr.setString(3,sc.next());
	            System.out.println("enter the state of person");
	            pr.setString(4,sc.next());
	            System.out.println("enter the salary of person");
	            pr.setInt(5,sc.nextInt());
	            int i=pr.executeUpdate();
	            System.out.println(i+"record Inserted");
	            cn.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	 public void delete() {
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satkar","root","root");
			 PreparedStatement pr=cn.prepareStatement("delete from persons where name=?");
			 System.out.println("enter the name of person whose record u wants to delete ");
			 pr.setString(1,sc.next());
			 int i=pr.executeUpdate();
			 System.out.println(i+" records deleted");
			 cn.close();
			 
		 }catch(Exception e) {
			 System.out.println(e);
		 }
	 }
	 public void update() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/satkar","root","root");
			PreparedStatement pr=cn.prepareStatement("update persons set name=? where name=?");
			System.out.println("enter the name of person whose salary u wants to update");
			pr.setString(1,sc.next());
			pr.setInt(5,sc.nextInt());
		}catch(Exception e) {
			System.out.println(e);
		}
	 }

	public static void main(String[] args) throws ClassNotFoundException {
		PreperedStatement prestm=new PreperedStatement();
             Scanner sc=new Scanner(System.in);
		     System.out.println("which operation u wants to perfom");
             int n=sc.nextInt();
             switch(n) {
             case 1:
            	 prestm.insert();
            	 System.out.println("updated succesfully");
            	 break;
             case 2:
            	 prestm.delete();
            	 System.out.println("deleted successfully");
            	 break;
             case 3:
            	 prestm.update();
            	 System.out.println("Updated succesfully");
            	 break;
             
             }
       
	}
}
