package day05_array.ex05.foreach;

public class MainEntry {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		
		System.out.println("***** ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ "\t");
		}
		
		// for(�ڷ��� ������ : �÷��Ǹ� or �迭�� { �ݺ����� })
		System.out.println("\n***** for each ���");
		for (int item : a) {
			System.out.print(item+'\t');
		}
		
		System.out.println("\n��������");
		for (int i = a.length -1; i >= 0; i--) {
			System.out.print(a[i]+"\t");
		}
	}

}
