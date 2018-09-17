package q_dao;
import Bean.question;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class questionDao{
	
public int[] setDetails(question obj){

	 String[] q=new String[10];
	 String[] a=new String[10];
	 String[] A=new String[10];
	 String[] B=new String[10];
	 String[] C=new String[10];
	 String[] D=new String[10];
	 int[] qid=new int[10];
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
			 int k,i=0,j;
		while(i<10)
		{
			k = 1 + (int)(Math.random() * 20); 
			for(j=0;j<i;j++)
			{
				if(qid[j]==k)
					k = 1 + (int)(Math.random() * 20); 			
			}
			String sql = "SELECT * FROM questions where id="+k;
			ResultSet rs=stmt.executeQuery(sql); 
			while(rs.next())
				{
					qid[i]=k;
					q[i]=rs.getString("question");
					a[i]=rs.getString("answer");
					A[i]=rs.getString("A");
					B[i]=rs.getString("B");
					C[i]=rs.getString("C");
					D[i]=rs.getString("D");
					i++;
				}
		}
		obj.setQ(q,a,A,B,C,D);		
		return(qid);
	}
		catch(Exception e)
		{
				return(qid);
		}

	}
	public String[] getAnswers(int[] qid){

	String[] A=new String[5];
	int i=0,k;
		final String JDBC_DRIVER="com.mysql.jdbc.Driver";
		final String DB_URL="jdbc:mysql://localhost:3306/test";
		final String USER="root";
		final String PASS="swarna";
		String sql;
		
		Connection conn=null;
		Statement stmt=null;
		try{

			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			stmt=conn.createStatement();
			 // Create SQL Query
			 stmt = conn.createStatement();
			while(i<10)
			{
					k=qid[i];
					sql = "SELECT answer FROM questions where id="+k;
					ResultSet rs=stmt.executeQuery(sql); 
					while(rs.next())
					{
								A[i]=rs.getString("answer");
								i++;
					}	

			}
		return A;
	}
		catch(Exception e)
		{
				return A;
		}

	}
}
