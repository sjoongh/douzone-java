package day07_oop.quiz;

import java.util.Scanner;

public class PartTime extends Employee {
	
	// PartTime
	// �ϼ� * �ð� �ܰ�

	private int time;
	private int pay;
	private int result;
	
	public PartTime() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �ð� : ");
		this.time = sc.nextInt();
		System.out.println("�޿� : ");
		this.pay = sc.nextInt();
		this.result = time+pay;
	}
	
	@Override
	public String toString() {

		return "PartTime [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", partTimePay="+result+"]";
	}
}
