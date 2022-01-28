package day04_controller.quiz;

import java.util.Scanner;

public class Quiz_Score2 {
	public static void main(String[] args) {
		// 점수는 0~100점 사이값만 입력 받기
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
			System.out.printf("총점 : %d 평균 : %.0f\n 학점 : %s", tot, avg, grade);
			System.out.println("\n\n계속하시겠습니까? y/n");
			
			// String으로 'n'이나 'y'을 받을 경우 ==으로 하면 stack영역의 변수를 비교해 heap영역의 변수값을 비교할 수 없음
			// --> equals를 사용하여 해결할 수 있음(heap영역 변수값 비교)
			// equals : 대소문자 구분하여 비교
			// equalsIgnoreCase : 대소문자 구분하지 않고 비교
			
			ch = sc.next().charAt(0);
			if (ch == 'y') {
				chose = true;
			} else if (ch == 'n') {
				chose = false;
			}
			
		}
	}

}
