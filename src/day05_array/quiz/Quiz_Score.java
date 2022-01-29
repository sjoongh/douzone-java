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
		
		System.out.println("�л� ���� �Է��ϼ���.");
		
		// String�迭�� sc.nextInt()�� �Է¹��� ����ŭ name�� ������ �� �ִ�.
		String[] name = new String[sc.nextInt()];
		
		// [�л�����] [3���� ����+total] ����
		String[][] students = new String[name.length][5];
		
		int[] total = new int[name.length];
		double[] avg = new double[name.length];
		String[] grade = new String[name.length];
		int[] rank = new int[name.length];
		
		for (int i = 0; i < name.length; i++) {
			
			System.out.print("�̸��� �Է��ϼ��� : ");
			students[i][0] = sc.next();
			
			System.out.print("���� ������ �Է��ϼ��� : ");
			students[i][1] = sc.next();
			
			System.out.print("���� ������ �Է��ϼ��� : ");
			students[i][2] = sc.next();
			
			System.out.print("���� ������ �Է��ϼ��� : ");
			students[i][3] = sc.next();
			
			total[i] = (Integer.parseInt(students[i][1]) + Integer.parseInt(students[i][2]) + Integer.parseInt(students[i][3]));
			
			avg[i] = total[i] / 3.0;
			
				switch((int) avg[i]) {
				case 100:
					grade[i] = "A+";
					break;
				case 90:
					grade[i] = "A";
					break;
				case 80:
					grade[i] = "B";
					break;
				case 70:
					grade[i] = "C";
					break;
				case 60:
					grade[i] = "D";
					break;
				default:
					grade[i] = "F";
					break;
				}
			
			rank[i] = 1;
		}
		
		// ����
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		// ���
		for (int i = 0; i < name.length; i++) {
			System.out.println("===============================================================================================================");
			System.out.print("�� �� : "+students[i][0]+" | ");
			System.out.print("���� ���� : "+students[i][1]+" | ");
			System.out.print("���� ���� : "+students[i][2]+" | ");
			System.out.print("���� ���� : "+students[i][3]+" | ");
			System.out.print("�� �� : "+total[i]+" | ");
			System.out.printf("�� �� : %.2f�� | ", avg[i]);
			System.out.print("�� �� : "+grade[i]+" | ");
			System.out.print("�� �� : "+rank[i]+"��");
			System.out.println();
		}
		
		sc.close();
	}

}
