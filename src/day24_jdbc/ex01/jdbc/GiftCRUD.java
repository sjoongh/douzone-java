package day24_jdbc.ex01.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day24_jdbc.connUtil.DBConnection;

public class GiftCRUD  {
	static Scanner sc = new Scanner(System.in);
	
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	
	// select
	public static void select() throws SQLException {
		stmt = conn.createStatement();
		rs = stmt.executeQuery("SELECT * FROM GIFT");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t\t"+gname+"\t\t  "+g_s+"\t"+g_e);

		}

	}
	// insert
	public static void insert() throws SQLException {
		ps = conn.prepareStatement( "INSERT INTO GIFT VALUES( ?, ?, ?, ? )");
		
		System.out.println("상품번호, 상품명, 최저가, 최고가 입력하세요. ");
		
		int gno = sc.nextInt();
		String gname = sc.next();
		int g_s = sc.nextInt();
		int g_e = sc.nextInt();
		
		ps.setInt(1, gno);
		ps.setString(2, gname);
		ps.setInt(3, g_s);
		ps.setInt(4, g_e);
	
		int result = ps.executeUpdate();
		
		System.out.println(result+"데이터 추가 성공");
		System.out.println(gname+"상품 추가 성공");
		
	}
	// update
	public static void update() throws SQLException {
		ps = conn.prepareStatement( "UPDATE GIFT SET gname=?, g_s=?, g_e=? where gno=?");
		
		System.out.println("수정할 상품번호, 상품명, 최저가, 최고가 입력하세요. ");
		
		int gno = sc.nextInt();
		String gname = sc.next();
		int g_s = sc.nextInt();
		int g_e = sc.nextInt();
		
		ps.setInt(1, gno);
		ps.setString(2, gname);
		ps.setInt(3, g_s);
		ps.setInt(4, g_e);
	
		int result = ps.executeUpdate();
		
		System.out.println(result+" 데이터 수정 성공");
		System.out.println(gname+" -> 상품 수정 성공");
		
	}
	// delete
	public static void delete() throws SQLException {
		ps = conn.prepareStatement( "DELETE from GIFT where gno=?");
		
		System.out.println("삭제할 gno는?");
		int gno = sc.nextInt();
		
		int result = ps.executeUpdate();
		System.out.println("삭제 성공");
		
	}
	// menu()
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n메뉴를 선택하세요");
		System.out.println("1. select | 2. insert | 3. update | 4. delete");
		int num = sc.nextInt();
		
		return num;
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		conn = DBConnection.getConnection();
		// 과제..
		boolean run = true;
		int result = 0;
		
		while (run) {
//			menu();
//			result = sc.nextInt();
			switch(menu()) {
			case 1:
				select();
				break;
			case 2:
				insert();
				break;
			case 3:
				update();
				break;
			case 4:
				delete();
				break;
			default:
				System.out.println("종료되었습니다.");
				rs.close(); conn.close();
				System.exit(0);
			}
		}
		
	}

}
