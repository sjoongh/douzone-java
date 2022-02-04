package day07_oop.quiz;

import java.util.Scanner;

public class Triangle extends Draw { // Trangle(Sub class)
	
	public Triangle() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� = ");
		this.w = sc.nextInt(); // Draw���� ��ӹ���
		System.out.print("���� = ");
		this.h = sc.nextInt();
	}

	@Override
	public double calc() {
		this.result = (w * h) / 2.0;
		return super.calc();
	}

	@Override
	public String toString() {
		result = calc();
		return "Triangle [w=" + w + ", h=" + h + ", result=" + result + "]";
	}

	@Override
	public void show() {
		super.show();
	}

	
}
