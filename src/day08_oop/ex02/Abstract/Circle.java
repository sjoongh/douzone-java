package day08_oop.ex02.Abstract;

public class Circle extends Shape {
	
	int h = 5;
	
	@Override
	public double calc(double x ) {
		result = (x * h) / 10;
		return result;
	}
	
	@Override
	public void show(String name) {
		calc(8.8);
		System.out.println(result + "ũ����" +name+"�� �׷������ϴ�.");
	}
}
