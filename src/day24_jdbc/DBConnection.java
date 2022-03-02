package day24_jdbc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	private static Connection conn;
	
	private DBConnection() { }
	
	static {
		// 환경설정 파일을 읽어오기 위한 객체 생성
		Properties prop = new Properties();
		Reader reader;
		try {
			reader = new FileReader("./db/oracle.properties"); // 읽어올 파일 지정
			prop.load(reader);
		} catch(FileNotFoundException e) {
			System.out.println("예외: 지정한 파일을 찾을 수 없습니다. : "+e.getMessage());
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		String driverName = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String pwd = prop.getProperty("pw");
		
		try {
			Class.forName(driverName);
			conn = DriverManager.getConnection(url, user, pwd);
			System.out.println("connection success");
		} catch (ClassNotFoundException e) {
			System.out.println("예외: 드라이버 로드 실패"+e.getMessage());
		} catch (SQLException e) {
			System.out.println("예외 : connection fail : "+e.getMessage());
			e.printStackTrace();
		}
	}
	public static Connection getConnection() {
		return conn;
	}
	
}
	
