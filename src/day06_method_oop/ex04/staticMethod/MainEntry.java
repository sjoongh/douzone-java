package day06_method_oop.ex04.staticMethod;

public class MainEntry {
	public static void main(String[] args) {
		A obj = new A(); // ��ü����, �޸𸮿� �Ҵ�, �������Լ� �ڵ� ȣ��
		
		obj.x = 9;
		System.out.println(obj.x);
//		obj.setData(3, 5); // object.methodName
		A.setData(10, 20); // className.methodName();
	}
}

class A {
	// static method
	int x, y;
	
	public static void setData(int xx, int yy) {
		System.out.println(xx + ", " + yy);
	} 
} // A class end

/*
static method : ��ü ���� ���� �ٷ� ��� ����
	object.methodName();
*/