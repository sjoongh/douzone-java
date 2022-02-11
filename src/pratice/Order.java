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
	
	// 
	public void addOrder() {
		getDate();
		getNo();
	}
	
	// ������ ��¥ ���
	public void findDate() {
		Scanner sc = new Scanner(System.in);
		setDate(sc.next());
	}
	
//	// ���� �Է�
//	inputorder {
//		
//	}
//	// ���� ���
//	createorder {
//		
//	}
//	// ���� ���
//	cancelorder {
//		
//	}
//	
//	// ������ ���� method
//	public member() {
//		
//	}
}
