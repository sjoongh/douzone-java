package day08_oop.ex04.Interface;

import day08_oop.ex02.Abstract.Shape;
import day08_oop.ex05.Interface.IDraw;

public class MultiClass extends Shape implements Test, IDraw {

	@Override
	public void draw() {
		System.out.println("idraw interface");
	}

	@Override
	public void tView() {
		System.out.println("test interface");
	}

	@Override
	public double calc(double x) {
		System.out.println("shape class");
		return 1000;
	}

	@Override
	public void show(String name) {
		System.out.println(name);
	}
}
