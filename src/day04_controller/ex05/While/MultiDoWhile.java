package day04_controller.ex05.While;

import java.util.Scanner;

public class MultiDoWhile {

	public static void main(String[] args) {
		
		int a = 1, b = 1;
		
		do {
			b = 1; // while, do~while�������� ���� �ȿ� �ִ� ������ �ʱ�ȭ
			do {
				System.out.print(b + "\t");
				b++;
			} while(b <= 3);
			
			a++;
			System.out.println();
		} while(a <= 2);
	}
}
