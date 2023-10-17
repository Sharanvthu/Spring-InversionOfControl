package com.jspider.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zomato {

	public static void main(String[] args) throws Exception
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		int count=0;
		List<String> lst=Arrays.asList("rcb","a");
		for(String s:lst)
		{
		
	User u1=(User)context.getBean(s);

		//==========================INSERTION=============================================
				String s1="INSERT INTO zomato VALUES(?,?,?,?,?,?)";
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
				
		
				PreparedStatement st=con.prepareStatement(s1);
				st.setString(1, u1.getUserName());
				st.setInt(2, u1.getUserId());
				st.setString(3, u1.getHomeAddress().getState());
				st.setString(4, u1.getHomeAddress().getCity());
				st.setString(5, u1.getWorkAddress().getState());
				st.setString(6, u1.getWorkAddress().getCity());
				 count =st.executeUpdate();
				count++;
		
				st.close();
				con.close();
				
		}
		System.out.println(count+" times data entered");
		//============================FETCH===============================================
		//		String s="Select * from zomato";
		//		Class.forName("oracle.jdbc.driver.OracleDriver");
		//		Connection con=DriverManager.getConnection
		//				("jdbc:oracle:thin:@localhost:1521:ORCLE123","SCOTT","tiger");
		//		Statement st=con.createStatement();
		//		ResultSet res=st.executeQuery(s);
		//		while (res.next()) 
		//		{
		//			System.out.println(res.getString(1)+" "+res.getInt(2)+" "+res.getString(3)+" "+res.getString(4)+" "+
		//					res.getString(5)+" "+res.getString(6)+" ");
		//		}
		//
		//		res.close();
		//		st.close();
		//		con.close();

	}

}
