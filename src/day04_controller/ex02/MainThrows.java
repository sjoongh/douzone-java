package day04_controller.ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainThrows {
	// ���� ����, �������� ������ ��ü������ �����
	// �ֻ����� ��� ������ �ް��Ϸ��� -> throws Exception�ϸ� ��
	public static void main(String[] args) 
			throws ArithmeticException, InputMismatchException {

		Scanner sc = new Scanner(System.in);
		
		// ������ ������ ��� �ڵ带 try ~ catch���� �־�� ������ �������ִ�.
		int x,y,result = 0;
		x = sc.nextInt();
		y = sc.nextInt();
		
		result = x / y; // �����߻� ����
		System.out.println("integer data 2 input");
	}

}
