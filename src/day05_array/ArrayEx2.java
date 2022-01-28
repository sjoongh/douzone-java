package day05_array;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[2][3];
//		int x = 0;
//		System.out.println("x = " + x);
		
		System.out.println("array data 2row, 3col = ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("a["+i+"]["+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
