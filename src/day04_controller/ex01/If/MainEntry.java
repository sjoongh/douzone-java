package day04_controller.ex01.If;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		System.out.print("integer data input :");
		int su = new Scanner(System.in).nextInt();
		
		// ¦, Ȧ�� ���� if
		if (su % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("���");
		}
		System.out.println("====================");
		
		// ���, ����, 0 ���� if
		if (su > 0) {
			System.out.println("���");
		}
		else if (su < 0) {
			System.out.println("����");
		}
		else System.out.println("0 �̱���.");
	}

}
