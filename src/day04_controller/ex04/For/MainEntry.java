package day04_controller.ex04.For;

public class MainEntry {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) System.out.println();
			System.out.println( (i+1) + "\t");
		} // for end
		
		int count = 0, total = 0;
		// 문제[ : 1~100까지 중에서 3의 배수의 개수와 합을 구하는 프로그램 작성
		for (int j = 0; j < 100; j++) {
			if (j % 3 == 0) {
				count += 1;
				total += j;
			}
		}
		System.out.printf("%d %d",count, total);
		System.out.println();
		
		// for (; a<=; ;)
		// 위 처럼 초기값과 증감값은 생략 가능
		// for (; ; ) -> 무한루프
	}

}
