package pratice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int end = 0;
		
		while (run) {
			System.out.println("메뉴를 선택하세요");
			
			System.out.println("1. 수주 입력");
			System.out.println("2. 수주 등록");
			System.out.println("3. 수주 취소");
			System.out.println("0. 프로그램 종료");
			end = sc.nextInt();
			
			if (end == 1) {
				
				System.out.println("수주에 대한 정보를 입력하세요");
			} else if (end == 2) {
				
				System.out.println("수주가 등록되었습니다.");
			} else if (end == 3) {
				
				System.out.println("수주가 취소되었습니다.");
			} else if (end == 0) {
				run = false;
				System.out.println("종료되었습니다.");
			}
		}
	}

}
