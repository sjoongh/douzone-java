package day04_controller.ex05.While;

import java.util.Scanner;

public class DoWhileMain {

	public static void main(String[] args) {
		// su 정수 데이터 1개 입력 받아서 0~100사이값만 입력 받아서 출력하는 프로그램 작성(do~while)
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
			do {
				num = sc.nextInt();
				i++;
			} while((num >= 0) && (num <= 100));
	}
}
