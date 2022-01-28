package day04_controller.ex04.For;

import java.util.Scanner;

public class MainFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(j + "*" + i + "=" + i*j);
			}
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				System.out.print("*");
			}
		}
	}

}
