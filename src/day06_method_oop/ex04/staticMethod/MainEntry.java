package day06_method_oop.ex04.staticMethod;

public class MainEntry {
	public static void main(String[] args) {
		A obj = new A(); // 객체생성, 메모리에 할당, 생성자함수 자동 호출
		
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
static method : 객체 생성 없이 바로 사용 가능
	object.methodName();
*/