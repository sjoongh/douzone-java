package day04_controller.ex04.For;

public class MainEntry {

	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0) System.out.println();
			System.out.println( (i+1) + "\t");
		} // for end
		
		int count = 0, total = 0;
		// ����[ : 1~100���� �߿��� 3�� ����� ������ ���� ���ϴ� ���α׷� �ۼ�
		for (int j = 0; j < 100; j++) {
			if (j % 3 == 0) {
				count += 1;
				total += j;
			}
		}
		System.out.printf("%d %d",count, total);
		System.out.println();
		
		// for (; a<=; ;)
		// �� ó�� �ʱⰪ�� �������� ���� ����
		// for (; ; ) -> ���ѷ���
	}

}
