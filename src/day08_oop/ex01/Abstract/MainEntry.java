package day08_oop.ex01.Abstract;

abstract class Shape {
	
	double result = 0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("super class Shape");
	}
}

class Circle extends Shape {

	double r = 5.0;
	
	@Override
	public double calc() {
		result = r * r * Math.PI;
		return result;
	}

	@Override
	public void draw() {
		System.out.println("원의 넓이 : "+result+"인 원을 그렸습니다.");
	}
	
}

abstract class Shape2 {
	
	double result2 = 0;
	public abstract double calc2();
	public abstract void draw2();
}

class Trinagle extends Shape2 {
	
	double w = 6.0;
	double h = 7.0;

	@Override
	public double calc2() {
		result2 = w * h;
		return result2;
	}

	@Override
	public void draw2() {
		System.out.println("삼각형 넓이 : "+result2+"그렸습니다.");
	}
	
}

public class MainEntry {
	public static void main(String[] args) {
		Circle r = new Circle();
		r.draw();
		
		// Shape sh = new Shape(); // 자체적으로 객체 생성할 수 없다.
//		Shape sh = new Circle(); // 상속 받은 자손 클래스로는 객체 생성 할 수 있다.
		
	}
}
