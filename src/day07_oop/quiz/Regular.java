package day07_oop.quiz;

import java.util.Scanner;

// 급여
public class Regular extends Employee {
	
	protected int pay;
	// 월급 주기
	Scanner sc = new Scanner(System.in);
		
	
	public Regular() {
		System.out.println("급여 입력 : ");
		this.pay = sc.nextInt();
	}

	@Override
	public String toString() {

		return "Regular [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", pay="+pay+"]";
	}
	
	
	
}
