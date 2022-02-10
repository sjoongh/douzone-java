package day10_collection.quiz;

public class Member {
	String name;
	String address;
	String tel;
	
	public Member(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return String.format("�̸� : %s �ּ� : %s ����ó : %s", name, address, tel);
	}
}
