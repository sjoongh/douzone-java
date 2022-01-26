package ex01.operator;

// 최단산쉬관논삼대콤
public class MainEntry {
	public static void main(String[] args) {
		// 산술연산자 : +,-,*,/,%,.....
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + (y*x));
		
		System.out.println(x + "*" + y + " = " + (y * x));
		
		System.out.println("\n\n3+4 * 5 = " + (3+4*5));
		System.out.println("3+4 * 5 = " + (3+4)*5);
		
		// 정수 (+,-,*,/,%,...) 정수 = 정수
		System.out.println("\n7 / 3 =" + (7 / 3)); // 몫
		System.out.println("\n7 % 3 =" + (7 % 3)); // 나머지
		
		System.out.println("\n7 / 3.0 = " + (7 / 3.0));
		System.out.println("\n7 / 3.0 = " + (7. / 3.));
		
// 2. 비트 부정
//		int x = 10, y;
//		
//		y = ~10; // 비트부정 - (원래값 + 1) ===> 출력결과
//		
//		System.out.println("x = " + x + "\ty = " + y);
		
		
// 1. 단항연산자 : 증감 ==> ++, --, ~, .....
//		int x = 10, y;
		
//		y = x++; // 후위연산 : 대입먼저, 연산나중
//		y = ++x; // 전위연산 : 연산먼저, 대입나중
//		y = x--;
		
//		++x; // x++
//		y = x;
//		System.out.println("x= " + x + "\ty = " + y);
	}
}
