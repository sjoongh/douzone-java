package day07_oop.ex02.inhertance;

public class Point {
	protected int x, y;

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
	
	// output method
	public void disp() {
		System.out.println("x : "+x+"\ty : "+y);
	}
	
}
