package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		// 성적표 국어, 영어, 전산, 이름, 입력 받아서 총점, 평균
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("국어, 영어, 전산, 이름 ==> ");
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
		
		// 학점(평점) : A ~ F 학점
		String grade= null;
	switch((int) avg) { // 형변환 후 나눔
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
		
		System.out.println("\n\n**** " +name+"님의 성적표********");
		System.out.println("국어 : " + kor + " 영어 : " + eng + " 전산 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f\n학점 : %s", tot, avg, grade);
	}

}
