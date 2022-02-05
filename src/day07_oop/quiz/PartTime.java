package day07_oop.quiz;

import java.util.Scanner;

public class PartTime extends Employee {
	
	// PartTime
	// 일수 * 시간 단가

	private int time;
	private int pay;
	private int result;
	
	public PartTime() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("일한 시간 : ");
		this.time = sc.nextInt();
		System.out.println("급여 : ");
		this.pay = sc.nextInt();
		this.result = time+pay;
	}
	
	@Override
	public String toString() {

		return "PartTime [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", partTimePay="+result+"]";
	}
}
