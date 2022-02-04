package day07_oop.ex02.inhertance;

public class Circle extends Point {
	private int r;
	
	public Circle() {
		x = y = 10;
		System.out.println("Circle default");
	}
	
	public Circle(int x, int y) {
		super(x, y);
		System.out.println("Circle 2");
	}
	
	public Circle(int x) {
		super(x);
		System.out.println("Circle 1");
	}
	
	public Circle(int x, int y, int r) {
		this.r = r;
		System.out.println("Circle 3");
	}
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	
	
//	public String toString() {
//		String str = "x : \t" + x + "\ty : "+y +" r : "+r;
//		return str;
//	}
	
//	public void disp() {
//		super.disp();
//		System.out.println("x : "+x+"\ty : "+y+" r : "+r);
//	}
}
