package day08_oop.quiz;

public class Bus extends Trans {
	
	@Override
	public void start(boolean bus, String name) {
		if (bus == true) {

			name = "bus";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
	
	@Override
	public void stop(boolean bus, String name) {
		if (bus == false) {

			name = "bus";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
}
