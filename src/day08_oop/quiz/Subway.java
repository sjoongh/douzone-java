package day08_oop.quiz;

public class Subway extends Trans {

	@Override
	public void start(boolean subway, String name) {
		if (subway == true) {

			name = "subway";
			System.out.println(name+"���� ��");	
		} else {
			System.out.println("error");
		}
	}
	
	@Override
	public void stop(boolean subway, String name) {
		if (subway == false) {

			name = "subway";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
}
