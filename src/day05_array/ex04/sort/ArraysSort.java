package day05_array.ex04.sort;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("******* sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		// sort
		System.out.println("\n��������");
		Arrays.sort(a);
		
//		System.out.println("\n***** sort �� ���");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n��������");
		for (int i = a.length -1; i >= 0; i--) {
			System.out.print(a[i]+"\t");
		}
	}

}
