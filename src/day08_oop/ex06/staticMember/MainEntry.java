package day08_oop.ex06.staticMember;

class Atm {
	int count;
	static int total;
	
	public Atm(int amount) {
		count += amount;
		total += amount;
	}
	
	// static member에서 일반멤버 변수는 사용할 수 없다.
	public static void view() {
		total = total + 100;
//		count = count + 100;
	}
	
	public void display() {
		System.out.println("count = "+ count);
		System.out.println("total = "+ total);
	}
}

public class MainEntry {

	public static void main(String[] args) {
		System.out.println(Atm.total);
		
		Atm at = new Atm(1000);
		at.display();
		System.out.println("------------------------");
		
		Atm at2 = new Atm(1000);
		at2.display();
		System.out.println("------------------------");

		Atm at3 = new Atm(1000);
		at3.display();
		

	}

}
