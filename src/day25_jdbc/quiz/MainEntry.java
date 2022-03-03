package day25_jdbc.quiz;

import java.sql.SQLException;

public class MainEntry {
	// 고객 테이블 이용한 JDBC CRUD 구현하기 (mvc 형태로~)
	public static void main(String[] args) throws SQLException {	
		customer_controller.connect();
		customer_controller.menu();
	}

}
