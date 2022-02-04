package day07_oop.ex02.inhertance;

public class Point {
	protected int x, y;
	
	public Point() {
		x = y = 20;
		System.out.println("Point default");
	}
	public Point(int x) {
		this.x = x;
		y = 9;
		System.out.println("Point 1");
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 2");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
//	public String toString() {
//		String str = "x : \t" + x + "\ty : "+y;
//		return str;
//	}
	
	// output method
//	public void disp() {
//		System.out.println("x : "+x+"\ty : "+y);
//	}
	
}
