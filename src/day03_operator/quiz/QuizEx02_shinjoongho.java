package day03_operator.quiz;

public class QuizEx02_shinjoongho {

	public static void main(String[] args) {
		int su = 123456;
		// 시,분,초 나타내기
		// 34, 17, 36
		System.out.println(su / 3600); // 시
		System.out.println((su % 3600) / 60); // 분
		System.out.println(su % 60); // 초
	}

}
