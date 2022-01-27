package day04_controller.ex02;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 선언을 제외한 모든 코드를 try ~ catch문에 넣어야 에러를 잡을수있다.
		int x,y,result = 0;
		
		System.out.println("integer data 2 input");
		
		// 상위 예외가 맨위에 있을 경우 구체적으로 하위예외를 잡을 수 없다.
		// 때문에 하위예외의 어디에 걸리는지 구체적으로 알고 싶다면
		// catch문 작성시 하위예외를 위에서부터 쓰는 것이 바람직하다.
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // 문제발생 있음
			System.out.println(x + "/" + y + "=" + result);
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("ArithmeticException"); // 하위 예외
			
		} catch(RuntimeException e) {
			System.out.println("printStackTrace");
			
		} catch(Exception e) {
			System.out.println("Exception"); // 상위 예외
			
		} finally {
			System.out.println("finally 무조건 출력된다.");
		} // try end
	}

}
