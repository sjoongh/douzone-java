package day05_array;

public class MainEntry {

	public static void main(String[] args) {
		// 1.
		char[] ch; // �迭 ����
		ch = new char[4]; // �迭����, �޸� �Ҵ�
		
		// 2.
		// int[][] a2 = new int[][] { {1,2,3}, {4,5,6} }
		char[] ch2 = new char[4]; // �迭 ����� ����
		// �迭 �ʱ�ȭ
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		
		System.out.println(ch2[0]);
		System.out.println(ch2[3]);
		System.out.println("=============");
		for (int i = 0; i < 4; i++) {
			System.out.println(ch2[i]);
		}
		// 3.
		// �迭�� ���̺��� data ���� ������ error
		// int[][] a3 = { {1,2,3}, {4,5,6} }
		char[] ch3 = {'a', 'k', 'P', 'D', 'y', 'R', '7', 'u'}; // �ʱ�ȭ
		System.out.println(ch3[1]);
		
		System.out.println("array length: " + ch3.length);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ch3[i]);
		}
		System.out.println("===============");
		String[] str = {"a", "kbs", "Park", "D", "you" };
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
