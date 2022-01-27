package day03_operator.quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
        	int j = 2;
            for (j = 2; j < num[i]; j++) {
                if (num[i] % j == 0)
                    break;
            }
            if (j == num[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}