package day08_oop.ex08.api;

class Rectangle {
	int x, y;
	public void disp() {
		System.out.println(x+", "+y);
	}
	
	@Override
	public String toString() {
		
		return "Rectangle [x = " + x + ", y=" + y +"]";
	}
	
	// �ؿ� ó�� �����Ǹ� ���� ������
	// �޸𸮻� �ּҰ��� ���� -> ���� ��µ��� �ʴ´�.
//	@Override
//	public String toString() {
//		
//		return x+", "+y;
//	}
	
	
}

public class ToStringMain {
	
	@Override
	public String toString() {
		return "ToStringMain [toString()="+super.toString()+"]";
	}

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.disp();
		System.out.println(r);
		System.out.println(r.toString());
	}
	
}
