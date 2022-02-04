package day07_oop.ex02.inhertance;

public class Rect extends Point {
	private int x2, y2;
	
	public Rect() {
		x = y = x2 = y2 = 100;
	}
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	private int r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Rect [x2=" + x2 + ", y2=" + y2 + ", r=" + r + "]";
	}

//	public String toString() {
//		String str = "x : \t" + x + "\ty : "+y;
//		return str;
//	}
	
//	public void disp() {
//		super.disp();
//		System.out.println("x : "+x+"\ty : "+y+" r : "+r);
//	}
}
