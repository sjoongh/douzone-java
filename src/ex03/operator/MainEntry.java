package ex03.operator;

public class MainEntry {

	public static void main(String[] args) {
		// 2. 대입연산자 : =, +=, -=, >>=, <<=, /=, %=, *=, .....
		int x = 3, y = 5, result;
		result = x + y;
		
		x += y;
		x = x + y;
		
		x = x * y;
		x *= y;
		
		// 1. 논리연산자 : &, &&(and), |, ||(or), ^(xor), !(not),
		// 			2진 논리 ==> 결과 값, 10진논리 ==> 결과 참/거짓
		
//		int x = 4, y = 7;
//		
//		System.out.println(x & y);
//		System.out.println(x | y);
//		System.out.println(x ^ y);
//		
//		int a = 10, b = 20, c = 30;
//		boolean result = true;
//		
//		result = (a > b) && (b > c); // && 연산은 앞에 것이 '거짓'이면 뒤는 수행X
//		System.out.println(result);
//
//		result = (a < b) && (b < c);
//		System.out.println(result);
//
//		result = (a > b) || (b > c); // ||연산은 앞에 것이 참이면 뒤는 수행X
//		System.out.println(result);
//		
//		System.out.println(!result);
	}

}
