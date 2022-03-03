package day25_jdbc.ex02.jdbc_mvc;

import java.sql.SQLException;

public class MainEntry { // View

	public static void main(String[] args) 
			throws SQLException {
		
		GiftController.connect(); // 연결 메소드 호출 -> static이라 불러와짐
		GiftController.menu();
	}
}
