package day24_jdbc.ex01.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import day24_jdbc.connUtil.DBConnection;

public class GiftInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		
		// 1. 드라이브 로드
		conn = DBConnection.getConnection();
		// 2. Connection & open
					// driver:@IP:portNumber:SID ==> "jdbc:oracle:thin:@localhost:1512:orcl";
//		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:\\Oracle\\Wallet_kosaDB";
//		String uid = "user04";
//		String pwd = "xxxxxxAt22cc";
//		
//		System.out.println("connection success!");
		// 3. 사용(DML 명령) - insert
		Statement stmt = conn.createStatement();
		int gno = sc.nextInt();
//		String sql = "insert into gift values(11, 'usb', 10, 200)";
		String sql = "insert into gift values("+sc.next()+","+")";
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"데이터 추가 성공");
		
		
		// 4. 자원반환(닫기)
		stmt.close(); conn.close();
	}

}
