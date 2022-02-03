package day05_array.ex04.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("******* sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - i; j++) {
				
				if (a[j] < a[j+1]) {
					tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
		
		
		System.out.println("\n***** sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
