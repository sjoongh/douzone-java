package day03_operator.quiz;

public class QuizEx01_shinjoongho {
	public static void main(String[] args) {
		// %, / ��������� �̿��� ��� ��� ����ϱ�
		int pay = 567890;
		int won1 = pay / 10000;
		int won2 = (pay / 1000) % 10;
		int won3 = (pay / 100) % 10;
		int won4 = (pay / 10) % 10 ;
		System.out.printf("���� : %d, õ�� : %d, ��� : %d, �ʿ� : %d", won1, won2, won3, won4);
//		result:
//		���� : 56��
//		õ�� : 7��
//		��� : 8��
//		�ʿ� : 9��
	}
}
