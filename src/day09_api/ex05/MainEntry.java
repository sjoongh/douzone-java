package day09_api.ex05;

class A { }

class B extends A { }

public class MainEntry {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
//		A bb = new B();
//		B a1 = new A();
		
		System.out.println("a instanceif A "+(a instanceof A));
		System.out.println("a instanceif A "+(a instanceof A));
		System.out.println("a instanceif A "+(a instanceof B));
		System.out.println("a instanceif A "+(a instanceof B));
	}

}
