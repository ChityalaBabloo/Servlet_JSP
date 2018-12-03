package com.cp.servlet.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CapStoreDao {

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
	
	public int addCart(String pid) {
		con = getConnection();
		//selecting information from product table  of particular productId
				String query = "select * from products where productId=?";
				try {
				PreparedStatement ps = con.prepareStatement(query);
				ps.setString(1, pid);
				ResultSet rs = ps.executeQuery();
				rs.next();
			
				//Inserting those details into cart table.
				String sql = "Insert into cart values(slno_seq.nextVal,?,?,?,?,?,?,?)";
				PreparedStatement ps1 = con.prepareStatement(sql);
				ps1.setString(1,rs.getString(1));
				ps1.setString(2,rs.getString(2));
				ps1.setString(3,rs.getString(3));
				ps1.setString(4,rs.getString(4));
				ps1.setString(5,rs.getString(5));
				ps1.setString(6,rs.getString(6));
				ps1.setString(7,rs.getString(7));
			
				int result = ps1.executeUpdate();
				return result;
			}catch (Exception e) {
				e.printStackTrace();
				return 0;
		}		
	}

	public int insertBuy(String pid, String address) {
		con = getConnection();
		
		//selecting information from product table  of particular productId
		String query = "select * from products where productId=?";
		try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, pid);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		//Inserting those details into cart table.
		String sql = "Insert into buy values(orderId_seq.nextVal,?,?,?,?,?,?)";
		PreparedStatement ps1 = con.prepareStatement(sql);
		ps1.setString(1,rs.getString(1));
		ps1.setString(2,rs.getString(2));
		ps1.setString(3,rs.getString(3));
		ps1.setString(4,rs.getString(4));
		ps1.setString(5,rs.getString(7));
		ps1.setString(6,address);
		int result = ps1.executeUpdate();
		if(result>0) {
			String query1 = "select max(orderId) from buy";
			PreparedStatement ps2 = con.prepareStatement(query1);
			ResultSet rs1 = ps2.executeQuery();
			rs1.next();
			
			return rs1.getInt(1);	
		}
		else {
			return 0;
		}
	}catch (Exception e) {
		e.printStackTrace();
		return 0;
	}
	}
}
