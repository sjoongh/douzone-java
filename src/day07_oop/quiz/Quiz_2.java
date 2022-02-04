package day07_oop.quiz;

// class Draw { int w, h; double result; }
// sub class : Circle ¿øÀÇ ³ÐÀÌ, Triangle »ï°¢Çü ³ÐÀÌ / 2
public class Quiz_2 {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println(c);
		
		Triangle t = new Triangle();
		System.out.println(t);
		t.setH(10);
		t.setW(20);
		System.out.println(t);
	}
}
