package day03_operator.quiz;

import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
	
			int [][] dp = new int [N+1][M+1];
			
			// N���� M�� �ٸ��� ���� ����� �� 
			for(int j = 1; j < M+1; j++) 
				dp[1][j] = j;
			
			// N == M�϶� 1
			for(int j = 1; j < N+1; j++) {
				for(int k = 1 ; k < M+1 ; k++) {
					if(j==k)
						dp[j][k] = 1;
				}
			}
			
			// DP�κ�
			for(int k = 2; k < N+1; k++) {
				for(int l = k+1 ; l < M+1 ; l++) {
					dp[k][l] = dp[k-1][l-1] + dp[k][l-1];
					}
			}
			System.out.println(dp[N][M]);
		}
	}
}