package s_dao;
import Bean.student;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class studentDao{
		public int enroll(student s){
		String name=s.getName();
		String email=s.getEmail();
		int id = 1 + (int)(Math.random() * 50); 
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/test";
		final String USER="root";
		final String PASS="swarna";
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			 // Create SQL Query
			 stmt = conn.createStatement();
			String SQL = "insert into result values("+id+",'"+name+"','"+email+"',0)";
			stmt.executeUpdate(SQL); 
			return id;
}
catch(Exception e)
{
	return id;
}

	}
public void setScore(int m,int id){

		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/test";
		final String USER="root";
		final String PASS="swarna";
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			 // Create SQL Query
			int i=0;
			 stmt = conn.createStatement();
			String sql="UPDATE result SET score = " + m + " WHERE id = " +id;
			stmt.executeUpdate(sql);
			return ;
}
catch(Exception e)
{
	return ;
}

	}
public String[] getDetails(int id){

		String[] details=new String[2];
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/test";
		final String USER="root";
		final String PASS="swarna";
		Connection conn=null;
		Statement stmt=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			 // Create SQL Query
			int i=0;
			 stmt = conn.createStatement();
			String SQL = "select * from result where id="+id;
			ResultSet rs=stmt.executeQuery(SQL);
			while(rs.next())
			{
				details[i]=rs.getString("name");
				details[i+1]=rs.getString("email");
			} 
			return details;
}
catch(Exception e)
{
	return details;
}

	}
}
