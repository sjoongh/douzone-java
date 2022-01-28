package day04_controller.ex05.While;

import java.util.Scanner;

public class MultiDoWhile {

	public static void main(String[] args) {
		
		int a = 1, b = 1;
		
		do {
			b = 1; // while, do~while문에서는 안쪽 안에 있는 변수의 초기화
			do {
				System.out.print(b + "\t");
				b++;
			} while(b <= 3);
			
			a++;
			System.out.println();
		} while(a <= 2);
	}
}
