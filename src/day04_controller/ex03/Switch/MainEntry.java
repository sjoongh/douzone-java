package day04_controller.ex03.Switch;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		System.out.println("����� ����Ʈ ������?(1~3��) input : ");
		int point = new Scanner(System.in).nextInt();
		
		switch(point) {
		case 1:
			System.out.println("����Ʈ ���� 1�� �Դϴ�.");
			break;
		case 2:
			System.out.println("����Ʈ ���� 2�� �Դϴ�.");
			break;
		case 3:
			System.out.println("����Ʈ ���� 3�� �Դϴ�.");
			break;
		default:
			System.out.println("���� ���� �Դϴ�. 1~3������ �Է� ���");
		}// end switch
		
	}
}
