package day06_method_oop.ex01.method;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	
	// 1. 매개변수와 리턴타입이 없는 경우
	public static void namePrint() {
		for (int i = 1; i < 11; i++) {
			System.out.println("Hello"+i);
		}
	}
	
	// 3. 매개변수 없고, 리턴타입 있는 경우
	public static int plus() {
		int result = 300;
		return result;
	}
	
	// 오버로드
	public static double plus(int x) {
		int sum = x + 100;
		return sum;
	}

	public static void main(String[] args) {

		System.out.println(plus(10));
		int result = plus();
		System.out.println(result);
		
//		add(1,2);
//		namePrint();
//		namePrint();
//		namePrint();
//		add(10, 30);
		
		
//		int[] a = {1,2,3,4,5,6,7};
//		Scanner sc; // 객체 선언
//		sc = new Scanner(System.in); // 객체생성, 메모리에 할당, 생성자함수 자동호출
//		
//		
//		int kor = sc.nextInt();
//		System.out.println(kor);
//		
//		Arrays.sort(a);
	}
	
	// 2. 매개변수가 있고 리턴타입이 없는 경우
	public static void add(int x, int y) {
		int hap = x + y;
		System.out.println("hap = " + hap);
	}

}
