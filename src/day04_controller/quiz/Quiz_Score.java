package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		// ����ǥ ����, ����, ����, �̸�, �Է� �޾Ƽ� ����, ���
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("����, ����, ����, �̸� ==> ");
//		int x1 = sc.nextInt();
//		int x2 = sc.nextInt();
//		int x3 = sc.nextInt();
//		String name = sc.next();
//		
//		System.out.println(x1 + "," + x2 + "," + x3 + "," + name + "," + (x1+x2+x3) + "," + (x1+x2+x3) / 3);
		
		System.out.println("name = ");
		String name = sc.nextLine();
		
		System.out.println("kor, eng, com score = ");
		int kor = sc.nextInt();	int eng = sc.nextInt();	int com = sc.nextInt();
		
		int tot = kor + eng + com;
		double avg = tot / 3.0;
		
		// ����(����) : A ~ F ����
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
		System.out.printf("���� : %d ��� : %.1f\n���� : %s", tot, avg, grade);
	}

}
