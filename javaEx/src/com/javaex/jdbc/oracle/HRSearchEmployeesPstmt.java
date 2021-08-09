package com.javaex.jdbc.oracle;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
//		실습 2
		
//		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
//		
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("검색어:");
//		String keyword = sc.next();
//		
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(dburl, "hr", "hr");
//			
//			// 실행계획
//			String sql = " SELECT CONCAT(first_name, last_name) name, " +
//			" email, phone_number, hire_date" +
//			" FROM employees" +
//			" WHERE lower(first_name) LIKE ? OR" +
//			" lower(last_name) LIKE ?";
//			// 준비
//			pstmt = conn.prepareStatement(sql);
//			// 파라미터 세팅, keywort.toLowerCase가 Like뒤로 들어감
//			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
//			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
//			
//			// 실행
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) {
//				String name = rs.getString(1);
//				String email = rs.getString(2);
//				String phoneNumber = rs.getString(3);
//				String hiredate = rs.getString(4);
//				
//				System.out.printf("%s: %s, %s, %s%n",
//						name, email, phoneNumber, hiredate);
//			}
//		} catch (ClassNotFoundException e) {
//			System.err.println("드라이버 로드 실패");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				conn.close();
//				pstmt.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//	}
//		-----------------------------------------------------
//		실습 3
		
//		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("급여 입력");
//		int maxmoney = sc.nextInt();
//		int minmoney = sc.nextInt();
//
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			conn = DriverManager.getConnection(dburl, "hr", "hr");
//
//			pstmt = conn.prepareStatement("SELECT first_name, salary " + "FROM employees"
//					+ " WHERE salary <= ? AND salary >= ?"
//					+ " ORDER BY salary");
//			
//			pstmt.setInt(1, maxmoney);
//			pstmt.setInt(2, minmoney);
//			
//			rs = pstmt.executeQuery();
//			while (rs.next()) {
//				System.out.printf("%-10s	%-8s %n", rs.getString("first_name"), 
//						rs.getString("salary")); 
//			}
//		} catch (ClassNotFoundException e) {
//			System.err.println("드라이버 로드 실패");
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				rs.close();
//				conn.close();
//				pstmt.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//		--------------------------------------------------------
//		실습 4
		
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Search name:");
		String find = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");
			
			pstmt = conn.prepareStatement(
			"SELECT first_name, email, phone_number, hire_date" + 
			" FROM employees" + " WHERE first_name LIKE ?");
			// 소문자만 출력하고 싶을 때
			// lower(first_name)
			// find.toLowerCase() 이런식으로 쓰지 않으면 대/소문자 구분없이 결과출력
			pstmt.setString(1, "%" + find + "%");
			
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("first_name");
				String email = rs.getString("email");
				String number = rs.getString("phone_number");
				String date = rs.getString("hire_date");
				
				System.out.println(name+" "+email+" "+number+" "+date +"\n");
				}  
			} catch (ClassNotFoundException e) {
				System.err.println("드라이버 로드 실패");
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					conn.close();
					pstmt.close();
					} catch (Exception e) {
						e.printStackTrace();
						}
				}
		}
}
