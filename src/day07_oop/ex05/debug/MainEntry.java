package day07_oop.ex05.debug;

public class MainEntry {

	public static void main(String[] args) {
		
		int x = 5, y = 0;
		int i;
		
		for (i = 1; i < 6; i++) {
			y += x * i;
		} // end for
		
		for (i = 1; i < 100; i++) {
			if (i == 30) break;
			System.out.println(i);
		} // end for
		
		System.out.println(x + ", " + y + ", " + i);
	}

}
