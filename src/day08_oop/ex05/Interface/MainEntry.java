package day08_oop.ex05.Interface;

public class MainEntry {

	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		System.out.println(b.su);
		
		// 2. super
		IDraw bb = new BB();
		bb.draw();
		System.out.println(bb.su);
	}

}
