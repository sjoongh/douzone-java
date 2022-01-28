package day04_controller.ex05.While;

public class MainEntry {

	public static void main(String[] args) {
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i);	
		}
		System.out.println("while=============");
		
		int i = 10;
		
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
		System.out.println("do~while=============");
		i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i < 11);
	}

}
