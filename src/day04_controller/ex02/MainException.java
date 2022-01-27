package day04_controller.ex02;

import java.util.Scanner;

public class MainException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x,y,result = 0;
		
		System.out.println("integer data 2 input");
		x = sc.nextInt();
		y = sc.nextInt();
		
		
		try {
			result = x / y; // 문제발생 있음
			
			System.out.println(x + "/" + y + "=" + result);
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("finally 무조건 출력된다.");
		}
	}

}
