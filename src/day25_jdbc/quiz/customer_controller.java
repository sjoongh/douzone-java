package day25_jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day25_jdbc.connUtil.DBConnection;

public class customer_controller {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	
	public static void connect() {
		try {
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
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
	
	public static void menu() throws SQLException {
		customer custo = new customer();
		
		while (true) {
			DBConnection.menu();
			
			switch(sc.nextInt()) {
			case 0:
				close();
				System.out.println("종료되었습니다.");
				System.exit(0);
			case 1:
				selectAll(custo.getClassName());
				insert();
				selectAll(custo.getClassName());
				break;
			case 2:
				update();
				selectAll(custo.getClassName());
				break;
			case 3:
				selectAll(custo.ClassName);
				break;
			case 4:
				select();
				break;
			case 5:
				delete();
				selectAll(custo.getClassName());
				break;
			}
		}
	}
	
	public static void selectAll(String className) {
		try {
			System.out.println(className);
			rs = stmt.executeQuery("select * from " + className);
			ResultSetMetaData rsmd = rs.getMetaData();
			int count = rsmd.getColumnCount();
			
			while (rs.next()) {
				int code = rs.getInt(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				
				System.out.printf("%d: %s, %s, %s%n", code, name, email, phone);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void insert() {
		System.out.print("code : ");
		int code = sc.nextInt();
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("email : ");
		String email = sc.next();
		System.out.print("phone : ");
		String phone = sc.next();
		try {
			pstmt = conn.prepareStatement("insert into gift values(?, ?, ?, ?)");
			
			pstmt.setInt(1, code);
			pstmt.setNString(2, name);
			pstmt.setNString(3, email);
			pstmt.setNString(4, phone);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result+"개의 데이터 추가 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void update() {
		String column = null;
		String column1 = null;
		String find = null;
		String find2 = null;
		
		System.out.println("UPDATE gift SET?");
		column = sc.next();
		System.out.println(" = ?");
		find = sc.next();
		System.out.println("WHERE?");
		column1 = sc.next();
		System.out.println(" = ?");
		find2 = sc.next();
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void select() {
		System.out.println("검색할 내용은?");
		int finds = sc.nextInt();
		try {
			rs = stmt.executeQuery("select * from customers where no = '" + finds+"'");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void delete() {
		String find = null;
		
		System.out.println("삭제할 컬럼은?");
		
		try {
			rs = stmt.executeQuery("select * from " + find);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
