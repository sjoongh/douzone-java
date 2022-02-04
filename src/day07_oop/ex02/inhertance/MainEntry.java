package day07_oop.ex02.inhertance;


public class MainEntry {

	public static void main(String[] args) {
		Circle c = new Circle();
//		c.disp();
		System.out.println(c);
		
		Circle c2 = new Circle(1, 2, 3);
//		c2.disp();
		System.out.println(c2);
		
		Rect r = new Rect();
//		r.disp();
		System.out.println(r);
		
		Point pt = new Point();
//		pt.disp();
		System.out.println(pt);
//		Point pt2 = new Point(1, 2);
//		pt.disp();
//		Point pt3 = new Point(3);
		
	}

}
