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
			if (pstmt != null) pstmt.close();
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
				update();
				selectAll(gift.getClassName());
				break;
			case 3:
				selectAll(gift.ClassName);
				break;
			case 4:
				select();
				break;
			case 5:
				delete();
				selectAll(gift.getClassName());
				break;
			case 6:
				System.out.println("Commit 하시겠습니까?(Y/N)");
				System.out.println("안하시려면 Rollback 됩니다.");
				if (sc.next().equalsIgnoreCase("Y")) {
//					conn.commit(); // conn에서 직접 가져오지 않고 함수를 만들어 사용
					commit();
					selectAll(gift.getClassName());
				} else {
					rollback();
//					conn.rollback();
					selectAll(gift.getClassName());
				}
				break;
			}
		}
	}
	
	public static void rollback() throws SQLException {
		conn.rollback();
		System.out.println("rollback success!");
	}
	
	public static void commit() throws SQLException {
		conn.commit();
		System.out.println("commit success!!");
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

	
	public static void insert() {
		System.out.print("GNO : ");
		int gno = sc.nextInt();
		System.out.print("GNAME : ");
		String gname = sc.next();
		System.out.print("G_START : ");
		String g_start = sc.next();
		System.out.print("G_END : ");
		String g_end = sc.next();
		try {
			pstmt = conn.prepareStatement("insert into gift values(?, ?, ?, ?)");
			
			pstmt.setInt(1, gno);
			pstmt.setNString(2, gname);
			pstmt.setNString(3, g_start);
			pstmt.setNString(4, g_end);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result+"개의 데이터 추가 완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	// 어떤애로 수정할지 가져온 뒤 어떤것을 수정할지 또 물어봄
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
			if (column.equalsIgnoreCase("gname") && column1.equalsIgnoreCase("gname")) {
				pstmt = conn.prepareStatement( "UPDATE gift SET "+column+" = '"+find+"'"+" WHERE "+column1+" LIKE '"+find2+"'");
			} else if (column.equalsIgnoreCase("gname") && !column1.equalsIgnoreCase("gname")) {
				pstmt = conn.prepareStatement( "UPDATE gift SET "+column+" = '"+find+"'"+" WHERE "+column1+" = "+find2);
			} else if (!column.equalsIgnoreCase("gname") && column1.equalsIgnoreCase("gname")) {
				System.out.println("=================================");
				pstmt = conn.prepareStatement( "UPDATE gift SET "+column+" = "+find+" WHERE "+column1+" = '"+find2+"'");
			} else {
//				System.out.println("===============================================");
				pstmt = conn.prepareStatement( "UPDATE gift SET "+column+" = "+find+" WHERE "+column1+" = "+find2);
			}
			System.out.println(pstmt);
			int result = pstmt.executeUpdate();
			
			System.out.println(result +"update 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 조건에 의한 검색
	public static void select() {
		System.out.println("검색할 내용은?");
		int finds = sc.nextInt();
		try {
			
			rs = stmt.executeQuery("select * from gift where gno = '" + finds+"'");
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
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// 삭제
	public static void delete() {
		String column = null;
		String find = null;
		System.out.println("삭제할 column은?");
		column = sc.next();
		System.out.println("삭제 대상은?");
		find = sc.next();
		
		try {
			if (column == "gname") {
				pstmt = conn.prepareStatement( "DELETE from gift where "+column+" LIKE '"+find+"'");
			} else {
				pstmt = conn.prepareStatement( "DELETE from gift where "+column+" = "+find);
			}
			pstmt.executeUpdate();
			System.out.println("삭제 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
