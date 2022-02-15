//package day14_lambda_network.ex01.lambda;
//
////람다 : 매개변수 목록 -> 실행문
////불필요한 클래스의 정의도 없다.
////메소드의 리턴 타입도 없고, 이름도 없다
//
//interface Message {
//	public int something();
//}
//
//class Person {
//	public void greeting(Message msg) {
//		int su = msg.something();
//		System.out.println("number is : "+su);
//	}
//}
//
//public class LambdaMain {
//
//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		// 람다를 적용하지 않은 방법(매개변수 없음)
//		p.greeting(new Message() { // 익명 클래스
//			@Override
//			public int something() {
//				
//				return 2;
////				System.out.println("good!");
////				System.out.println("반가워요");
//			}
//		});
//		
//		// 람다 적용 방법
//		System.out.println("===================");
//		p.greeting(
//				() -> {
////					System.out.println("good morning!");
////					System.out.println("힘내유");
//					return 20;
//				});
//	}
//}
//
