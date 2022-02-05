package day07_oop.quiz;

import java.util.Scanner;

public class Sales extends Regular {
	// 커미션 월급에 3% -> * 0.3
	private double commission;
	private int result;
	
	Sales() {
		Scanner sc = new Scanner(System.in);
		System.out.println("커미션 : ");
		this.commission = sc.nextDouble();
		this.result = (int)((pay * commission / pay));
	}
	
	@Override
	public String toString() {
		return "Sales [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", commission"+commission+"%"+ ", commissionpay="+result+"]";
	}
}
