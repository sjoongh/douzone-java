package day07_oop.ex06.randomMethod;

public class MathRandom {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println();
		// random(): ���� �߻� 0.0 ~ 1.0
		System.out.println(Math.random());
		// 0 ~ n-1�� ��� ���ϸ�
		System.out.println(Math.random() * 5); // 0 ~ 4
		
		System.out.println();
		for (int i = 1; i < 7; i++) {
			System.out.println(Math.random() * 45);
		}
	}

}
