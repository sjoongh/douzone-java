package day07_oop.ex07.randomClass;

import java.util.Scanner;

public class UpDown {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 5;
		int user = 0;
		int num = (int)(Math.random() * 100) + 1;
		if ((num < 0) || (num > 100)) {
			System.out.println("false");
		} else {
		while (count > 0) {
			System.out.printf("���ڸ� �Է��ϼ���. %d���� ��ȸ", count);
			user = sc.nextInt();
			if (num > user) {
				System.out.println("up");
			}
			if (num < user) {
				System.out.println("down");
			}
			count -= 1;
		}
		if (num == user) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("\n�����Դϴ�.");
		}
		}
	}

}
