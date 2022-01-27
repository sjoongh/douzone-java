package day04_controller.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {
	// 예외 위임, 여러개의 에러를 구체적으로 적어도됨
	// 최상위로 모든 에러를 받게하려면 -> throws Exception하면 끝
	public static void main(String[] args) 
			throws ArithmeticException, InputMismatchException {

		Scanner sc = new Scanner(System.in);
		
		// 선언을 제외한 모든 코드를 try ~ catch문에 넣어야 에러를 잡을수있다.
		int x,y,result = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		result = x / y; // 문제발생 있음
		System.out.println("integer data 2 input");
	}

}
