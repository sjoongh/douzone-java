package pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int end = 0;
		
		while (run) {
			System.out.println("�޴��� �����ϼ���");
			
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���� ���");
			System.out.println("0. ���α׷� ����");
			end = sc.nextInt();
			
			if (end == 1) {
				
				System.out.println("���ֿ� ���� ������ �Է��ϼ���");
			} else if (end == 2) {
				
				System.out.println("���ְ� ��ϵǾ����ϴ�.");
			} else if (end == 3) {
				
				System.out.println("���ְ� ��ҵǾ����ϴ�.");
			} else if (end == 0) {
				run = false;
				System.out.println("����Ǿ����ϴ�.");
			}
		}
	}

}
