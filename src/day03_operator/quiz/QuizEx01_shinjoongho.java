package day03_operator.quiz;

public class QuizEx01_shinjoongho {
	public static void main(String[] args) {
		// %, / 산술연산자 이용한 계산 결과 출력하기
		int pay = 567890;
		int won1 = pay / 10000;
		int won2 = (pay / 1000) % 10;
		int won3 = (pay / 100) % 10;
		int won4 = (pay / 10) % 10 ;
		System.out.printf("만원 : %d, 천원 : %d, 백원 : %d, 십원 : %d", won1, won2, won3, won4);
//		result:
//		만원 : 56장
//		천원 : 7장
//		백원 : 8개
//		십원 : 9개
	}
}
