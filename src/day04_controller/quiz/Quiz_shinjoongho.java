package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_shinjoongho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 과제1. : 3가지 입력 받고 출력

		int tmp;
		System.out.println("정수 3개 입력");
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
		
		// 과제2. : 사칙연산 프로그램
		System.out.println("숫자 두개와 사칙연산자를 입력하세요");
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
					System.out.println("첫번째 숫자를 크게하세요.");
				} else {
					System.out.println(x + "/" + y + "=" + (x / y));	
				}
			}
		} else {
			System.out.println("음수가 아니여야 하며 사칙연산자만 가능합니다.");
		}
		
// ---------------------------------------------------------------
		
		// 과제3. 구구단
		System.out.println("구구단을 위해 숫자 하나를 입력하세요.");
		int gugu = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(gugu * i);
		}
	}

}
