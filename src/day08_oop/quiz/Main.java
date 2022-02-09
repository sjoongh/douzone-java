package day08_oop.quiz;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		int n = Integer.parseInt(sc.nextLine());
		
		int[][] color = new int[n][3];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(sc.nextLine(), " ");
			
			color[i][0] = Integer.parseInt(st.nextToken());
			color[i][1] = Integer.parseInt(st.nextToken());
			color[i][2] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 1; i < n; i++) {
			
		}
	}

}
