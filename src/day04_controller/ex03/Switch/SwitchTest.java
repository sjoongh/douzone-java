package day04_controller.ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.println("���ø� �����ϼ���(s, d, b, j) = ");
		
		// �Ǽ����� switch�� �� �� ����
		// ������ ���ڷ� ������ �ǰ�
		// char�� ''
		// String�� ""
		char ch = new Scanner(System.in).next().charAt(0);
		
		switch(ch) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
		case 's':
			System.out.print("����"); break;
		case 'd':
			System.out.print("�뱸"); break;
		case 'b':
			System.out.print("�λ�"); break;
		case 'j':
			System.out.print("����"); break;
		default:
			System.out.print("�߸� �����ϼ̽��ϴ�. s, d, b, j�߿����� �����ϼ���......");
			System.exit(0);
		}// end switch
		
		System.out.println("��(��) �����ϼ̽��ϴ�.");
		
	}
}
