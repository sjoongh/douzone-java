package day05_array.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// solution 1.
		// {1, 7, 5, 7, 2, 8, 7, 9, 12, 5, 7, 9}; --> 뭐든 상관x
		
//		int[] arr = {1, 7, 5, 7, 2, 8, 7, 9, 12, 5, 7, 9};
//		int find = 7;
//		int cnt = 0;
//		for (int i = 0; i < arr.length; i++) {
//			if (find == arr[i])
//				cnt += 1;
//		}
//		System.out.println(cnt);
		
		
		// solution 2.
		// 기상청 1월의 평균 강수량구하는 프로그램 작성, (단, 30일 기준)
//		Random random = new Random();
//		
//		int NUM = 3;
//		int total = 0;
//		int[] arr2 = new int[30];
//		
//		for (int i = 0; i < 30; i++) {
//			arr2[i] = random.nextInt(100);
//		}
//		for (int j = 0; j < arr2.length; j++) {
//			total += arr2[j];
//		}
//		System.out.println(total);
//		System.out.println(total / 30);
		
		// solution 3.
		// 2차원 배열로 입력 받아서 0,1 -> 1,2 -> 2,2, -> 3,3 더해서 출력하기
		// a[0][0] = 1
		int[][] arr3 = new int[2][2];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				arr3[i][j] = sc.nextInt();
			}
		}
		for (int k = 0; k < arr3.length; k++) {
			System.out.println(arr3[0][k] + arr3[1][k]);
			for (int l = 0; l < arr3.length; l++) {
				System.out.println("arr3["+arr3[k][l]+"]["+arr3[1][l]+"] = "+(arr3[k][l]+arr3[1][l]));
			}
		}
		
	}

}
