package day08_oop.ex03.Interface;

interface A { // interface - abstract metgod, final field만 갖는다.
	int x = 9; // final static int x = 90;
	final int y = 7777;
	char ch = 'A';
	
	// 추상메소드, abstract 생략 가능함 - 무조건 추상메소드임
	public void show();
	public abstract void disp();
} // A end

interface B {
	void bView();
}

interface C {
	String name = "happy";
	public void draw();
}

interface D extends B { // interface 간에 상속에서도 extends를 사용한다
	void dView();
}

class Rect implements D {

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dView() {
		// TODO Auto-generated method stub
		
	}
	
	public int plus(int x, int y) {
		return x + y;
	}
	
} // Rect end

class Shape {

}

class Multi extends Shape implements B, C, A {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bView() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainEntry {
	public static void main(String[] args) {

	}

}
