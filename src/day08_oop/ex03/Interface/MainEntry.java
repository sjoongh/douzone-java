package day08_oop.ex03.Interface;

interface A { // interface - abstract metgod, final field�� ���´�.
	int x = 9; // final static int x = 90;
	final int y = 7777;
	char ch = 'A';
	
	// �߻�޼ҵ�, abstract ���� ������ - ������ �߻�޼ҵ���
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

interface D extends B { // interface ���� ��ӿ����� extends�� ����Ѵ�
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
