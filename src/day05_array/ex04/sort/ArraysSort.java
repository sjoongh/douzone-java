package day05_array.ex04.sort;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("******* sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		// sort
		System.out.println("\n오름차순");
		Arrays.sort(a);
		
//		System.out.println("\n***** sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n내림차순");
		for (int i = a.length -1; i >= 0; i--) {
			System.out.print(a[i]+"\t");
		}
	}

}
