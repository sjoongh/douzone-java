package day05_array.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		// ������ 0~100�� ���̰��� �Է� �ޱ�
		// solution : ����ǥ�� ���ϴµ� ���������� ����(�迭 ���)
		// 7���� ����ǥ ���
		// [�ο���][�����+total]
		// �̸�, ����, ����, ���� ���� �Է� �޾Ƽ� ����/���/����(���) ���ϴ� ���α׷� �ۼ�
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int com = 0;
		char ch = ' ';
		int total = 0;
		boolean chose = true;
		String grade= null;
		
		int[] totallist = new int[2];
		
		String[][] result = new String [2][5];
		
		
		for (int i = 0; i < 2; i++) {
			System.out.println("�̸��� �Է��ϼ���");
			result[i][0] = sc.next();
			for (int j = 1; j < 4; j++) {
				System.out.println("����, ����, ���� ������ �Է��ϼ���.");
				result[i][j] = sc.next();
			}
			total = (Integer.parseInt(result[i][1]) + Integer.parseInt(result[i][2]) + Integer.parseInt(result[i][3]));
			result[i][4] = Integer.toString(total);
			
			double avg = total / 3.0;
			totallist[i] = Integer.total;
			
			System.out.println();
			
			Arrays.sort(total);
			String[] arrStr = str.split("");
	        Arrays.sort(arrStr, Collections.reverseOrder());
			
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
			
			System.out.println("\n\n**** " +result[i][0]+"���� ����ǥ********");
			System.out.println("���� : " + result[i][1] + " ���� : " + result[i][2] + " ���� : " + result[i][3]);
			System.out.printf("���� : %d ��� : %.0f\n ���� : %s", total, avg, grade);
			System.out.println("=======================================\n");
		}
		int tmp = 0;
	}

}