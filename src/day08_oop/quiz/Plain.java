package day08_oop.quiz;

public class Plain extends Trans {
	
	@Override
	public void start(boolean plain, String name) {
		if (plain == true) {

			name = "plain";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
	
	@Override
	public void stop(boolean plain, String name) {
		if (plain == false) {

			name = "plain";
			System.out.println(name+"���� ��");
		} else {
			System.out.println("error");
		}
	}
}
