package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_shinjoongho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����1. : 3���� �Է� �ް� ���

		int tmp;
		System.out.println("���� 3�� �Է�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (b > a) {
			tmp = a;
			a = b;
			b = tmp;
		}
		if (c > a) {
			tmp = a;
			a = c;
			c = tmp;
		}
		if (c > b) {
			tmp = b;
			b = c;
			c = tmp;
		}
		System.out.printf("%d >= %d >= %d", a, b, c);

// ---------------------------------------------------------------		
		
		// ����2. : ��Ģ���� ���α׷�
		System.out.println("���� �ΰ��� ��Ģ�����ڸ� �Է��ϼ���");
		int x = sc.nextInt();
		int y = sc.nextInt();
		char z = sc.next().charAt(0);
		if ((x > 0 && y > 0) && ((z != '+') || (z != '-') || (z != '*') || (z != '/'))) {
			if (z == '+')
				System.out.println(x + "+" + y + "=" + (x+y));
			if (z == '-')
				System.out.println(x + "-" + y + "=" + (x - y));
			if (z == '*')
				System.out.println(x + "*" + y + "=" + (x * y));
			if (z == '/') {
				if (x < y) {
					System.out.println("ù��° ���ڸ� ũ���ϼ���.");
				} else {
					System.out.println(x + "/" + y + "=" + (x / y));	
				}
			}
		} else {
			System.out.println("������ �ƴϿ��� �ϸ� ��Ģ�����ڸ� �����մϴ�.");
		}
		
// ---------------------------------------------------------------
		
		// ����3. ������
		System.out.println("�������� ���� ���� �ϳ��� �Է��ϼ���.");
		int gugu = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(gugu * i);
		}
	}

}
