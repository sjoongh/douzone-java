package day14_lambda_network.ex01.lambda;

interface Message {
	public void something(int x, int y);
}

interface Talk {
	public void something(String x, String y);
}

class Person {
	public void greeting(Talk msg) {
		msg.something("Hello","Hi");
	}
	
	public void greeting(Message msg) {
		msg.something(1, 2);
	}
}

public class LambdaMain4 {
	static int num = 0;

	public static void main(String[] args) {
		Person p = new Person();
		
		// 람다를 적용하지 않은 방법(파라미터 예제)
		p.greeting(new Message() { // 익명 클래스
			@Override
			public void something(int x, int y) {
				System.out.println("parameter value : "+x + ", "+y);
//				System.out.println("good!");
//				System.out.println("반가워요");
			}
		});
		
		// 람다 적용 방법
		System.out.println("===================");
		char ch = 'A';
		p.greeting((int x, int y) -> { // type에 대해 불문명할 경우는 명시적으로 타입을 써줘야 한다.(타입 생략 불가능)
			System.out.println("parameter value : " + x+", "+y);
			System.out.println(ch); // ch의 값은 변경할 수 없음
			num = 2222; // static 변수값은 변경 가능함
				});
	}
}

