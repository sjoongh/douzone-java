package day11_io.quiz;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int select = 0;
		
		ArrayList<BMI> test = new ArrayList<>();
		datas data = new datas();
		
		
		while (true) {
			System.out.println("-----------------입력---------------");
			System.out.println("1. 추가 | 2. 삭제 | 3. 출력 | 4. 수정 | 5. 종료");
			select = sc.nextInt();
			
			if (select == 1) {
				data.newbmi(test);
				data.create(test);
			} else if (select == 2) {
				data.delete(test);
				data.create(test);
			} else if (select == 3) {
				data.openFile(test);
			} else if (select == 4) {
				data.update(test);
				data.create(test);
			} else if (select == 5) {
				System.out.println("종료되었습니다.");
				System.exit(0);
			}
		}
	}
}
