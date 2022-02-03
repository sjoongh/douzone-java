package day06_method_oop.quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_Score {
	public static void main(String[] args) {
		input();
	}
	
	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학생 수를 입력하세요.");
		
		String[] name = new String[sc.nextInt()];
		String[][] students = new String[name.length][5];
		String[] grade = new String[name.length];
		int[] rank = new int[name.length];
		int cnt = 0;
		
		for (int i = 0; i < name.length; i++) {
			
			System.out.print("이름을 입력하세요 : ");
			students[i][0] = sc.next();
			
			System.out.print("국어 점수를 입력하세요 : ");
			students[i][1] = sc.next();
			
			System.out.print("영어 점수를 입력하세요 : ");
			students[i][2] = sc.next();
			
			System.out.print("전산 점수를 입력하세요 : ");
			students[i][3] = sc.next();
			
			if ((Integer.parseInt(students[i][1]) < 0) || (Integer.parseInt(students[i][1]) > 100) ||
					(Integer.parseInt(students[i][2]) < 0) || (Integer.parseInt(students[i][2]) > 100) ||
					(Integer.parseInt(students[i][3]) < 0) || (Integer.parseInt(students[i][3]) > 100)) {
				System.out.println("get out");
				cnt += 1;
				break;
			}
			
			total(name, Integer.parseInt(students[i][1]), Integer.parseInt(students[i][2]), Integer.parseInt(students[i][3]));
			int answer = Integer.parseInt(students[i][1])+Integer.parseInt(students[i][2])+Integer.parseInt(students[i][3]);
			average(answer);
			grade(average(answer));
			output(students[i][0], answer);
		}
		sc.close();
	}
	
	
	public static int total(String[] name, int one, int two, int three) {
		int total = 0;
		
		total = one+two+three;
		
		return total;
	}
	
	public static double average(int tot) {
		double avg = 0;
		
		avg = tot / 3.0;
		return avg;
	}
	
	public static String grade(double avg) {
		String grade = null;
		
		switch((int) avg) {
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
		
		return grade;
	}
	
	public static void output(String name, int total) {
			System.out.println("===============================================================================================================");
			System.out.print("이 름 : "+name+" | ");
			System.out.print("총 점 : "+total+" | ");
			System.out.printf("평 균 : %.2f점 | ", average(total));
			System.out.print("학 점 : "+grade(average(total))+" | ");
			System.out.println();
	}

}
