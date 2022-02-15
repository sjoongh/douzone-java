//package day14_lambda_network.ex01.lambda;
//
//interface Message {
//	public int something(int x, int y);
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something(1, 2);
//		System.out.println("number is : "+su);
//	}
//}
//
//public class LambdaMain3 {
//
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		// 람다를 적용하지 않은 방법(파라미터 예제)
//		p.greeting(new Message() { // 익명 클래스
//			@Override
//			public int something(int x, int y) {
//				System.out.println("parameter 예제");
//				System.out.println("parameter value : "+x + ", "+y);
//				return 30;
////				System.out.println("good!");
////				System.out.println("반가워요");
//			}
//		});
//		
//		// 람다 적용 방법
//		System.out.println("===================");
//		p.greeting((x, y) -> { // int x 처럼 타입을 안써도 됨, 괄호도 생략 가능
//			System.out.println("parameter value : " + x+", "+y);
//			System.out.println("힘내요");
//					return 200;
//				});
//	}
//}
//
