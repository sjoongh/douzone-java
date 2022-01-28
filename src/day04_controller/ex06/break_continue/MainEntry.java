package day04_controller.ex06.break_continue;

public class MainEntry {

	public static void main(String[] args) {
		// break, continue
		
		for (int i = 1; i < 11; i++) {
			if (i == 7) break;
			System.out.println(i);
		}
		System.out.println("main end");
	}

}
