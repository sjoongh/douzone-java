package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_Score2 {
	public static void main(String[] args) {
		// ������ 0~100�� ���̰��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int com = 0;
		char ch = ' ';
		boolean chose = true;
		
		while (chose == true) {
			System.out.println("name = ");
			String name = sc.next();
			
			System.out.println("kor, eng, com score = ");
			
			kor = sc.nextInt();
			eng = sc.nextInt();
			com = sc.nextInt();
			
			int tot = kor + eng + com;
			double avg = tot / 3.0;
			
			String grade= null;
			switch((int) avg) { // ����ȯ �� ����
				case 100:
					grade = "A+";
					break;
				case 90:
					grade = "A";
					break;
				case 80:
					grade = "B";
					break;
				case 70:
					grade = "C";
					break;
				case 60:
					grade = "D";
					break;
				default:
					grade = "F";
					break;
				}
			
			System.out.println("\n\n**** " +name+"���� ����ǥ********");
			System.out.println("���� : " + kor + " ���� : " + eng + " ���� : " + com);
			System.out.printf("���� : %d ��� : %.0f\n ���� : %s", tot, avg, grade);
			System.out.println("\n\n����Ͻðڽ��ϱ�? y/n");
			
			// String���� 'n'�̳� 'y'�� ���� ��� ==���� �ϸ� stack������ ������ ���� heap������ �������� ���� �� ����
			// --> equals�� ����Ͽ� �ذ��� �� ����(heap���� ������ ��)
			// equals : ��ҹ��� �����Ͽ� ��
			// equalsIgnoreCase : ��ҹ��� �������� �ʰ� ��
			
			ch = sc.next().charAt(0);
			if (ch == 'y') {
				chose = true;
			} else if (ch == 'n') {
				chose = false;
			}
			
		}
	}

}
