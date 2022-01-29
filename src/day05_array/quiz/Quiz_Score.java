package day05_array.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		// 점수는 0~100점 사이값만 입력 받기
		// solution : 성적표를 구하는데 이차원으로 구함(배열 사용)
		// 7명의 성적표 출력
		// [인원수][과목수+total]
		// 이름, 국어, 영어, 수학 점수 입력 받아서 총점/평균/학점(평균) 구하는 프로그램 작성
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		
		// String배열에 sc.nextInt()로 입력받은 수만큼 name을 생성할 수 있다.
		String[] name = new String[sc.nextInt()];
		
		// [학생마다] [3개의 과목+total] 생성
		String[][] students = new String[name.length][5];
		
		int[] total = new int[name.length];
		double[] avg = new double[name.length];
		String[] grade = new String[name.length];
		int[] rank = new int[name.length];
		
		for (int i = 0; i < name.length; i++) {
			
			System.out.print("이름을 입력하세요 : ");
			students[i][0] = sc.next();
			
			System.out.print("국어 점수를 입력하세요 : ");
			students[i][1] = sc.next();
			
			System.out.print("영어 점수를 입력하세요 : ");
			students[i][2] = sc.next();
			
			System.out.print("전산 점수를 입력하세요 : ");
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
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력문
		for (int i = 0; i < name.length; i++) {
			System.out.println("=============================================================================");
			System.out.print("이 름 : "+students[i][0]+" | ");
			System.out.print("국어 점수 : "+students[i][1]+" | ");
			System.out.print("영어 점수 : "+students[i][2]+" | ");
			System.out.print("전산 점수 : "+students[i][3]+" | ");
			System.out.print("총 점 : "+total[i]+" | ");
			System.out.printf("평 균 : %.2f점 | ", avg[i]);
			System.out.print("학 점 : "+grade[i]+" | ");
			System.out.print("석 차 : "+rank[i]+"등");
			System.out.println();
		}
		
		sc.close();
		
//		int kor = 0;
//		int eng = 0;
//		int com = 0;
//		char ch = ' ';
//		int total = 0;
//		boolean chose = true;
//		String grade= null;
//		
//		int[] totallist = new int[2];
//		
//		String[][] result = new String [2][5];
//		
//		
//		for (int i = 0; i < 2; i++) {
//			System.out.println("이름을 입력하세요");
//			result[i][0] = sc.next();
//			for (int j = 1; j < 4; j++) {
//				System.out.println("국어, 영어, 수학 점수를 입력하세요.");
//				result[i][j] = sc.next();
//			}
//			total = (Integer.parseInt(result[i][1]) + Integer.parseInt(result[i][2]) + Integer.parseInt(result[i][3]));
//			result[i][4] = Integer.toString(total);
//			
//			double avg = total / 3.0;
////			totallist[i] = Integer.total;
//			
//			System.out.println();
//			
////			Arrays.sort(total);
////			String[] arrStr = str.split("");
////	        Arrays.sort(arrStr, Collections.reverseOrder());
////			
//			switch((int) avg) { // 형변환 후 나눔
//			case 100:
//				grade = "A+";
//				break;
//			case 90:
//				grade = "A";
//				break;
//			case 80:
//				grade = "B";
//				break;
//			case 70:
//				grade = "C";
//				break;
//			case 60:
//				grade = "D";
//				break;
//			default:
//				grade = "F";
//				break;
//			}
//			
//			System.out.println("\n\n**** " +result[i][0]+"님의 성적표********");
//			System.out.println("국어 : " + result[i][1] + " 영어 : " + result[i][2] + " 전산 : " + result[i][3]);
//			System.out.printf("총점 : %d 평균 : %.0f\n 학점 : %s", total, avg, grade);
//			System.out.println("=======================================\n");
//		}
//		int tmp = 0;
	}

}
