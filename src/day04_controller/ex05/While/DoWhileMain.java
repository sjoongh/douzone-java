package day04_controller.ex05.While;

import java.util.Scanner;

public class DoWhileMain {

	public static void main(String[] args) {
		// su ���� ������ 1�� �Է� �޾Ƽ� 0~100���̰��� �Է� �޾Ƽ� ����ϴ� ���α׷� �ۼ�(do~while)
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int i = 0;
		
			do {
				num = sc.nextInt();
				i++;
			} while((num >= 0) && (num <= 100));
	}
}
