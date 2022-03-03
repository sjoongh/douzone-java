package day25_jdbc.ex02.jdbc_mvc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import day25_jdbc.connUtil.DBConnection;

public class GiftController { // Controller

	// 연결, 삽입, 삭제, 수정, 검색...
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null; // ? 사용
	
	// connect
	public static void connect() {
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			conn.setAutoCommit(false); // 자동커밋끄기
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// close();
	public static void close() {
		try {
			// 작은 것부터 순서대로 닫음
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (pstmt != null) stmt.close();
			if (conn != null) conn.close(); // connection은 가장 마지막에 닫아야함
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// menu
	public static void menu() throws SQLException {
		Gift gift = new Gift();
		
		while (true) {
			DBConnection.menu();
			
			switch(sc.nextInt()) {
			case 0:
				close();
				System.out.println("종료되었습니다.");
				System.exit(0);
			case 1:
				selectAll(gift.getClassName());
				insert();
				selectAll(gift.getClassName());
				break;
			case 2:
				break;
			case 3:
				selectAll(gift.ClassName);
				break;
			}
		}
	}
	
	// select All
	public static void selectAll(String className) throws SQLException {
		
		rs = stmt.executeQuery("select * from " + className);
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		while (rs.next()) {
			for (int i = 1; i <= count; i++) { // 각 타입별로 출력
				switch (rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getInt(i) + " ");
					break;
				case Types.FLOAT:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getFloat(i) + " ");
				case Types.DOUBLE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDouble(i) + " ");
					break;
				case Types.CHAR:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				case Types.DATE:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getDate(i) + " ");
					break;
				default:
					System.out.println(rsmd.getColumnName(i) + " : " + rs.getString(i) + " ");
					break;
				}
			}
			System.out.println();
		}
	}
	
	public static void insert() throws SQLException {
		
		rs = stmt.executeQuery("INSERT INTO from ");
		
	}
}
