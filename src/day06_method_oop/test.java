package day06_method_oop;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 2�� �Է�");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (y < 0) {
			System.out.println("�ι�° ���ڰ� 0���� �۽��ϴ�.");
		} else {
			add(x, y);
			System.out.println("sub : "+sub(x, y));
			System.out.println("mul : "+mul(x, y));
			div(x, y);
		}
	}
	
	public static void add(int x, int y) {
		System.out.println("add : "+(x+y));
	}
	
	public static int sub(int x, int y) {
		return x-y;
	}
	
	public static int mul(int x, int y) {
		
		return x*y;
	}
	
	public static void div(int x, int y) {
		System.out.println("div : "+ (x / y));
	}

}
