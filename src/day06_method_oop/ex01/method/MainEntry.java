package day06_method_oop.ex01.method;

import java.util.Arrays;
import java.util.Scanner;

public class MainEntry {
	
	// 1. �Ű������� ����Ÿ���� ���� ���
	public static void namePrint() {
		for (int i = 1; i < 11; i++) {
			System.out.println("Hello"+i);
		}
	}
	
	// 3. �Ű����� ����, ����Ÿ�� �ִ� ���
	public static int plus() {
		int result = 300;
		return result;
	}
	
	// �����ε�
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
//		Scanner sc; // ��ü ����
//		sc = new Scanner(System.in); // ��ü����, �޸𸮿� �Ҵ�, �������Լ� �ڵ�ȣ��
//		
//		
//		int kor = sc.nextInt();
//		System.out.println(kor);
//		
//		Arrays.sort(a);
	}
	
	// 2. �Ű������� �ְ� ����Ÿ���� ���� ���
	public static void add(int x, int y) {
		int hap = x + y;
		System.out.println("hap = " + hap);
	}

}
