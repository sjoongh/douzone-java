package ex04.Input;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("next() vs nextLine()");

		System.out.println("string input :");
//		String s1 = sc.next(); // 공백 인식 못함
		String s1 = sc.nextLine(); // 공백인식 o

		System.out.println("kor, eng = ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();

		System.out.println(s1);
		System.out.println(kor + "," + eng);
	}

}
