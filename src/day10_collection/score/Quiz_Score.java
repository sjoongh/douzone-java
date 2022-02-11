package day10_collection.score;

import java.util.ArrayList;
import java.util.Scanner;

import day10_collection.quiz.test;

public class Quiz_Score {
	public static void main(String[] args) {
		// 학생 추가 / 삭제 / 리스트 출력 / 수정 / 프로그램 종료
		ArrayList<Score> as = new ArrayList<Score>();		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		boolean run = true;
//		int[] rank = new int[name.length];
		
		while (run) {
			menu();
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				System.out.println("추가할 학생의 이름은?");
				System.out.print(" 이름 : ");
				String name = sc.next();
				System.out.print("국어 점수 : ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 : ");
				int eng = sc.nextInt();
				System.out.print("전산 점수 : ");
				int com = sc.nextInt();
				as.add(new Score(name, kor, eng, com));
				System.out.println("추가 완료");
				break;
				
			case 2:
				System.out.println("삭제할 학생의 이름은?");
				System.out.print(" 이름 : ");
				name = sc.next();
				for (int i = 0; i < as.size(); i++) {
					if (name.equals(as.get(i).getName())) {
						as.remove(i);
						System.out.println("삭제 완료");
					} else {
						System.out.println("error!");
					}
				}
				break;
				
			case 3:
				for (Score score : as)
					System.out.println(score);
				break;
				
			case 4:
				System.out.println("수정할 학생의 이름은?");
				int cnt = 0;
				name = sc.next();
				for (int i = 0; i < as.size(); i++) {
					if (name.equals(as.get(i).getName())) {
						cnt += 1;
						System.out.print("국어점수 수정 : ");
						kor = sc.nextInt();
						
						System.out.print("\n영어점수 수정 : ");
						eng = sc.nextInt();
						
						System.out.print("\n전산점수 수정 : ");
						com = sc.nextInt();
						
						as.get(i).setKor(kor);
						as.get(i).setEng(eng);
						as.get(i).setCom(com);
						
						break;
					}
				}
				if (cnt == 0) {
					System.out.println("error!");
					break;
				} else {
					System.out.println("수정완료");
					break;
				}
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
				
			default:
				System.out.println("error!");
				break;
			}
		}
		sc.close();
	}
	
	public static void menu() {
		System.out.println("-------------------------------------------------------");
		System.out.println("1. 추가	|	2. 삭제	|	3. 리스트	|	4. 수정	|	5. 종료");
		System.out.println("-------------------------------------------------------");
		System.out.println("메뉴를 선택하세요");
	}

}
