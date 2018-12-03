package com.cg.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
	
	public int add(String username, String password, String mail, String phone) {
		con = getConnection();
		
		String sql = "insert into users values(?,?,?,?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(3, password);
			ps.setString(2, mail);
			ps.setString(4, phone);
			
			int n = ps.executeUpdate();
			System.out.println(n);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
	}

	public boolean validateUser(String username, String password) {
		con = getConnection();
		String sql = "select * from users where name = ? and password = ?";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery() ;
			if(rs.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public int addProduct(String pid, String pname, String pmodel,
			String price) {
con = getConnection();
		
		String sql = "insert into users values(?,?,?,?)";
		
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, pid);
			ps.setString(3, pname);
			ps.setString(2, pmodel);
			ps.setString(4, price);
			
			int n = ps.executeUpdate();
			System.out.println(n);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public int updatePrice(String pidd, String price) {
		con =getConnection();
		String sql="update products set price=? where pid=?";
		try {
		ps=con.prepareStatement(sql);
		ps.setString(1,price);
		ps.setString(2,pidd);
		int n=ps.executeUpdate();
		return n;
		}catch(Exception e) {
		e.printStackTrace();
		}
		return 0;
		
	}
}
