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
		
		// 석차
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (total[i] < total[j]) {
					rank[i]++;
				}
			}
		}
		
		// 출력
		for (int i = 0; i < name.length; i++) {
			System.out.println("===============================================================================================================");
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
	}

}
