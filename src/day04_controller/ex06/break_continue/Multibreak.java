package day04_controller.ex06.break_continue;

public class Multibreak {

	public static void main(String[] args) {
		
		boolean flag = true;
		
		first: {
			second: {
				third: {
					int k = 100;
					System.out.println("before the break");
					if ( flag ) break second;
					
					System.out.println("This won't execute");
				}
				System.out.println("hello");
			}
			System.out.println("This is after second block");
		}
	}

}
