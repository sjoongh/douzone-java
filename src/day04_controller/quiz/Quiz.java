package day04_controller.quiz;

public class Quiz {

	public static void main(String[] args) {
		
		// solution 1
		boolean stop = true;
		int count = 0;
		int add = 0;
		for (int i = 1; i < 2; i++) {
			while (stop) {
				count += 1;
				if ((i == 1) && (count == 1)) {
					add += i;
				}
				else if (count > 1) {
					if (count == 6) {
						break;
					}
					else {
						for (int j = 1; j < count+1; j++) {
							add += j;
							System.out.println(j);
						}
					}
				}
			}
		}
		System.out.println(add);
		
		// solution 2
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				add += i;
			} else {
				add -= i;
			}
		}
		System.out.println(add);
		
		// solution 3
		int div = 1;
		double total = 0;
		for (double i = 1; i < 10; i++) {
			total += (i / (div+i));
		}
		System.out.printf("%.2f", total);
	}

}
