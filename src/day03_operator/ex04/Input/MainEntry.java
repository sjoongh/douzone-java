package day03_operator.ex04.Input;

import java.util.Scanner;
//import java.util.*;

public class MainEntry { // extends Object -> 최상위(자동)
	public static void main(String[] args) {
		System.out.println("Hi~~");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("integer, double, char data, input ==> ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(2);
		
		System.out.println(x + "," + y + "," + ch);
	}

}
