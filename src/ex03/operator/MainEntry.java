package ex03.operator;

public class MainEntry {

	public static void main(String[] args) {
		// 2. ���Կ����� : =, +=, -=, >>=, <<=, /=, %=, *=, .....
		int x = 3, y = 5, result;
		result = x + y;
		
		x += y;
		x = x + y;
		
		x = x * y;
		x *= y;
		
		// 1. �������� : &, &&(and), |, ||(or), ^(xor), !(not),
		// 			2�� �� ==> ��� ��, 10���� ==> ��� ��/����
		
//		int x = 4, y = 7;
//		
//		System.out.println(x & y);
//		System.out.println(x | y);
//		System.out.println(x ^ y);
//		
//		int a = 10, b = 20, c = 30;
//		boolean result = true;
//		
//		result = (a > b) && (b > c); // && ������ �տ� ���� '����'�̸� �ڴ� ����X
//		System.out.println(result);
//
//		result = (a < b) && (b < c);
//		System.out.println(result);
//
//		result = (a > b) || (b > c); // ||������ �տ� ���� ���̸� �ڴ� ����X
//		System.out.println(result);
//		
//		System.out.println(!result);
	}

}
