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
		
	}
	// update
	public static void update() throws SQLException {
		String column = null;
		String column1 = null;
		String find = null;
		String find2 = null;
		int ch = 0;
		System.out.println("update column?");
		System.out.println("1.gno, 2.gname, 3.g_s, 4.g_e");
		ch = sc.nextInt();
		if (ch == 1) {
			column = "gno";
		} else if (ch == 2) {
			column = "gname";
		} else if (ch == 3) {
			column = "g_s";
		} else if (ch == 4) {
			column = "g_e";
		} else {
			System.out.println("error");
		}
		System.out.println("update로 바뀌는 데이터는?");
		find = sc.next();
		System.out.println("update할 column은?");
		column1 = sc.next();
		System.out.println("update하고 싶은 데이터는?");
		find2 = sc.next();
		
		ps = conn.prepareStatement( "UPDATE gift SET "+column+" = '"+find+"'"+" WHERE "+column1+" LIKE '"+find2+"'");
	
		int result = ps.executeUpdate();
		
		System.out.println(result+" 데이터 수정 성공");
	}
	// delete
	public static void delete() throws SQLException {
		String column = null;
		String find = null;
		System.out.println("삭제할 column?");
		column = sc.next();
		System.out.println("삭제 대상?");
		find=sc.next();
		
		ps = conn.prepareStatement( "DELETE from gift where "+column+" LIKE '"+find+"'");
		
		ps.executeUpdate();
		System.out.println("삭제 성공");
		
	}
	// menu()
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n메뉴를 선택하세요");
		System.out.println("1. select | 2. insert | 3. update | 4. delete | 5. 종료");
		int num = sc.nextInt();
		
		return num;
	}

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
		conn = DBConnection.getConnection();
		// 과제
		boolean run = true;
		int result = 0;
		
		while (run) {
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
			case 5:
				System.out.println("종료되었습니다.");
				rs.close(); conn.close();
				break;
			}
		}
		
	}

}
