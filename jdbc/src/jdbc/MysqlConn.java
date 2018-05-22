package jdbc;

import java.sql.*;


public class MysqlConn {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection con;
		Statement st;
		ResultSet rs;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try {
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/satkar","root","root");
			    st=con.createStatement();
			    rs=st.executeQuery("select * from persons");
			    while(rs.next()) {
			    	System.out.println(rs.getString(1)+"||"+rs.getInt(2)+"||"+rs.getString(3)+"||"+rs.getString(4)+"||"+rs.getInt(5));
			    }
			    con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}

}
