package day07_oop.quiz;

import java.util.Scanner;

// �޿�
public class Regular extends Employee {
	
	protected int pay;
	// ���� �ֱ�
	Scanner sc = new Scanner(System.in);
		
	
	public Regular() {
		System.out.println("�޿� �Է� : ");
		this.pay = sc.nextInt();
	}

	@Override
	public String toString() {

		return "Regular [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + ", pay="+pay+"]";
	}
	
	
	
}
