package com.varsha.springprj.productmanagementapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDB {
	
	Connection conn = null;
	
	public ProductDB(String url, String user, String password) {
		try {
			conn = DriverManager.getConnection(url= "jdbc:mysql://localhost:3306/varshadb?useSSL=false", user="Product", password= "Varsha@20");
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public ProductDB() {
	
	}

	public void save(Product p) {
		
		String query = "select name,type,place, warranty from product";
		try {
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				Product a =new Product();
				int columnindex;
				p.setName(rs.getString(columnindex = 1));
				p.setType(rs.getString(columnindex = 2));
				p.setPlace(rs.getString(columnindex = 3));
				p.setWarranty(rs.getInt(columnindex = 4));
			    List<Product> products;
				/*products.add(p);*/
			
			}
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Product> getAll() {
		List<Product> products = new ArrayList<>();
		
		
		return products;
	}

}