package day06_method_oop.ex06.oop;

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point();
		pt.disp();
		
		pt.setX(90);	pt.setY(80);
		pt.disp();
//		System.out.println(pt.getX()+", "+pt.getY());
	}
}


class Point {
	int x, y; // ¸â¹öº¯¼ö
	
	// getter / setter method
	public int getX() { return x; }
	public void setX(int xx) { x = xx; }
	

	public int getY() { return y; }
	public void setY(int yy) { y = yy; }
	
	// user method - output
	public void disp() {
		System.out.println(x+ ", "+y);
		System.out.println(getX()+ ", "+getY());
	}
}
