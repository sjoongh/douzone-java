package day24_jdbc.ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. 드라이브 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver load success!!");
		
		// 2. Connection & open
					// driver:@IP:portNumber:SID ==> "jdbc:oracle:thin:@localhost:1512:orcl";
		String url = "jdbc:oracle:thin:@kosadb_high?TNS_ADMIN=C:\\Oracle\\Wallet_kosaDB";
		String uid = "user04";
		String pwd = "xxxxxxAt22cc";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!");
		// 3. 사용(DML 명령) - select
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString("gname");
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			
			System.out.println(gno+"\t"+gname+"\t"+g_s+"\t"+g_e);
		}
		
		// 4. 자원반환(닫기)
		rs.close(); stmt.close(); conn.close();
	}

}
