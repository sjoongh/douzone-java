package day25_jdbc.ex01.jdbc;

import java.sql.*;

import day24_jdbc.connUtil.DBConnection;

public class MainEntry {
	
	static Statement stmt = null;
	
	public static void main(String[] args) throws SQLException {
		// 자바는 자동 커밋임
		Connection conn = DBConnection.getConnection();
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			// SQL 구문, HTML 태그는 java/jsp/servelt 에서는 문자열 취급한다.
			String sql = "create table kosaTab(name varchar2(20), age number)";
			System.out.println(sql.toString());
			stmt.executeUpdate(sql); // 반환값이 없는 경우
			
			sql = "SELECT * from kosaTab";
			rs = stmt.executeQuery(sql); // 반환값이 있는 경우
			
			sql = "insert into kosaTab values('aa', 33)";
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개 추가됨");
			while (rs.next()) {
				System.out.println("name : " + rs.getString(1));
				System.out.println("age : " + rs.getInt("age"));
			}
			
			sql = "drop table kosaTab";
			result = stmt.executeUpdate(sql);
			System.out.println("drop table : "+result);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			rs.close(); stmt.close(); conn.close();
		}
	}
}
