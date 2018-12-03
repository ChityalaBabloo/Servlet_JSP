package com.cg.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {

	Connection con = null;
	PreparedStatement ps = null;
	
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String pass = "Capgemini123";
			con = DriverManager.getConnection(url, user, pass);
			return con;
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return con;
	}
	
	public int add(String username, String password, String mail, String mobile) {
		con = getConnection();
		
		String sql = "INSERT INTO user_details values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, mail);
			ps.setString(4, mobile);
			
			int n = ps.executeUpdate();
			//System.out.println(n);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}
}
