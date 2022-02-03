package day06_method_oop.ex05.instanceMethod;

public class MainEntry {
	public static void main(String[] args) {
		B b = new B();
		b.setData(20, 50);
	}

}

class B {
	int x, y;
	
	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	}
} // B class end