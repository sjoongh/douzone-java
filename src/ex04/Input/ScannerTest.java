package ex04.Input;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("next() vs nextLine()");

		System.out.println("string input :");
//		String s1 = sc.next(); // ���� �ν� ����
		String s1 = sc.nextLine(); // �����ν� o

		System.out.println("kor, eng = ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();

		System.out.println(s1);
		System.out.println(kor + "," + eng);
	}

}
