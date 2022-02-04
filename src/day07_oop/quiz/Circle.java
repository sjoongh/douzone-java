package day07_oop.quiz;

import java.util.Scanner;

public class Circle extends Draw {
	
	public Circle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("≥–¿Ã = ");
		this.w = sc.nextInt();
		System.out.print("≥Ù¿Ã = ");
		this.h = sc.nextInt();
	}

	@Override
	public double calc() {
		this.result = w * h;
		return super.calc();
	}

	@Override
	public String toString() {
		result = calc();
		return "Circle [w=" + w + ", h=" + h + ", result=" + result + "]";
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}
	
	
}
