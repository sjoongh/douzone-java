package day07_oop.ex02.inhertance;

public class Circle extends Point {
	
	private int r;
	
	public int getR() {
		return r;
	}
	
	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		super.disp();
		System.out.println("x : "+x+"\ty : "+y+" r : "+r);
	}
}
