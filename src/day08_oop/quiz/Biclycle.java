package day08_oop.quiz;

public class Biclycle extends Trans {
	
	@Override
	public void start(boolean subway, String name) {
		if (subway == true) {
			name = "Biclycle";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
	
	@Override
	public void stop(boolean subway, String name) {
		if (subway == false) {
			name = "Biclycle";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
}
