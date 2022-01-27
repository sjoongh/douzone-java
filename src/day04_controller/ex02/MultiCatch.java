package day04_controller.ex02;

import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// ������ ������ ��� �ڵ带 try ~ catch���� �־�� ������ �������ִ�.
		int x,y,result = 0;
		
		System.out.println("integer data 2 input");
		
		// ���� ���ܰ� ������ ���� ��� ��ü������ �������ܸ� ���� �� ����.
		// ������ ���������� ��� �ɸ����� ��ü������ �˰� �ʹٸ�
		// catch�� �ۼ��� �������ܸ� ���������� ���� ���� �ٶ����ϴ�.
		try {
			x = sc.nextInt();
			y = sc.nextInt();
			result = x / y; // �����߻� ����
			System.out.println(x + "/" + y + "=" + result);
		} catch(ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("ArithmeticException"); // ���� ����
			
		} catch(RuntimeException e) {
			System.out.println("printStackTrace");
			
		} catch(Exception e) {
			System.out.println("Exception"); // ���� ����
			
		} finally {
			System.out.println("finally ������ ��µȴ�.");
		} // try end
	}

}
