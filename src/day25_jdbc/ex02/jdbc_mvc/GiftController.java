package day25_jdbc.ex02.jdbc_mvc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day25_jdbc.connUtil.DBConnection;

public class GiftController { // Controller

	// 연결, 삽입, 삭제, 수정, 검색...
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	
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
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (conn != null) conn.close();
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
			case 1:
				select(gift.getClassName());
				insert();
				select (gift.getClassName());
				break;
			}
		}
	}
	
	public static void select(String className) throws SQLException {
		
		rs = stmt.executeQuery("select * from " + className);
		
	}
}
