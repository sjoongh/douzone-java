package day04_controller.ex03.Switch;

import java.util.Scanner;

public class SwitchTest {
	
	public static void main(String[] args) {
		
		System.out.println("도시를 선택하세요(s, d, b, j) = ");
		
		// 실수형은 switch에 올 수 없고
		// 정수는 숫자로 적으면 되고
		// char는 ''
		// String은 ""
		char ch = new Scanner(System.in).next().charAt(0);
		
		switch(ch) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
		case 's':
			System.out.print("서울"); break;
		case 'd':
			System.out.print("대구"); break;
		case 'b':
			System.out.print("부산"); break;
		case 'j':
			System.out.print("제주"); break;
		default:
			System.out.print("잘못 선택하셨습니다. s, d, b, j중에서만 선택하세요......");
			System.exit(0);
		}// end switch
		
		System.out.println("를(을) 선택하셨습니다.");
		
	}
}
