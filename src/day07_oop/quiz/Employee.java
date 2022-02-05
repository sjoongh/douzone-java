package day07_oop.quiz;

import java.util.Scanner;

public class Employee {
	// 이름, 직급, 부서, 연락처
	protected String name, pos, depart, ph;
	
	public Employee() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름");
		setName(sc.next());
		System.out.println("직급");
		setPos(sc.next());
		System.out.println("부서");
		setDepart(sc.next());
		System.out.println("번호");
		setPh(sc.next());
	}
	
	int getPays() {
		return 0;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pos=" + pos + ", depart=" + depart + ", ph=" + ph + "]";
	}
	
	
	
}
