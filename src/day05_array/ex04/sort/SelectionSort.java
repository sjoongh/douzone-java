package day05_array.ex04.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("******* sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		// ��Ʈ
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		System.out.println("\n***** sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
