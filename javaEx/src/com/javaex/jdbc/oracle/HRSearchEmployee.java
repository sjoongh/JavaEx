package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		System.out.println("찾을 이름");
		String find = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			String sql = "SELECT first_name, email, phone_number, hire_date" +
			" FROM employees" + "WHERE lower(first_name) LIKE ? ";
			
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, "%" + find.toLowerCase() + "%");
			
			rs = stmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString("email");
				String phone = rs.getString("phone_number");
				String date = rs.getString("hire_date");
				
				System.out.printf("%s, %s, %s, %s%n", name, email, phone, date);
			}  
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver를 찾지 못했습니다.");
		} catch (SQLException e) {
//			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}