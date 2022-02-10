package pratice;

import java.util.Scanner;

public class Order {
	private int no;
	private String date;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	// 수주 정보 등록
	public void addOrder() {
		getDate();
		getNo();
	}
	
	// 수주자 날짜 취득
	public void findDate() {
		Scanner sc = new Scanner(System.in);
		setDate(sc.next());
	}
	
//	// 수주 입력
//	inputorder {
//		
//	}
//	// 수주 등록
//	createorder {
//		
//	}
//	// 수주 취소
//	cancelorder {
//		
//	}
//	
//	// 수주자 정보 method
//	public member() {
//		
//	}
}
