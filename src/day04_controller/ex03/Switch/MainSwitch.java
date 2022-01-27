package day04_controller.ex03.Switch;

import java.util.Scanner;

public class MainSwitch {
	
	public static void main(String[] args) {
		
//		System.out.println("당신의 포인트 = ");
//		int point = new Scanner(System.in).nextInt();
//		
//		switch(point) { // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
//		case 1: System.out.print("서울"); break;
//		case 2: System.out.print("대구"); break;
//		case 3: System.out.print("부산"); break;
//		default:
//			System.out.print("잘못 선택하셨습니다. s, d, b, j중에서만 선택하세요......");
//			System.exit(0);
//		}// end switch
//		
//		System.out.println("를(을) 선택하셨습니다.");
		System.out.print("당신의 포인트  = ");
	      int point = new Scanner(System.in).nextInt();   // integer data
	      
	      switch( point ) {  // 조건 - 문자형, 정수형(long형 제외), 실수형 안됨
	         case 1 :   System.out.print("집 ");       //  break;
	         case 2 :   System.out.print("피아노 ");    //  break;
	         case 3 :   System.out.print("우산 ");     //  break;
	         
	      } // end switch
	      
	      System.out.println("상품에 당첨 되셨습니다. 축하합니다~~ ^^");
	}
}
