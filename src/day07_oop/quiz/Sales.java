package day07_oop.quiz;

import java.util.Scanner;

public class Sales extends Regular {
	// Ŀ�̼� ���޿� 3% -> * 0.3
	private double commission;
	private int result;
	
	Sales() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ŀ�̼� : ");
		this.commission = sc.nextDouble();
		this.result = (int)((pay * commission / pay));
	}
	
	@Override
	public String toString() {
		return "Sales [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", commission"+commission+"%"+ ", commissionpay="+result+"]";
	}
}
