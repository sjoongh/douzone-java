package day07_oop.ex01_oop;

public class MainEntry {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setX(100); c.setY(100); c.setR(5); c.disp();
		
		Point pt = new Point();
		pt.disp();
		pt.setX(5); pt.setY(10); pt.disp();
	}

}
