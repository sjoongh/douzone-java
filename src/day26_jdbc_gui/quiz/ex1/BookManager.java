package day26_jdbc_gui.quiz.ex1;

import java.util.Vector;

public class BookManager {
	public static int getRentalPrice(Vector<Book> bookList, String kind) {
		int count = 0;
		
		if (kind.equalsIgnoreCase("컴퓨터")) {
			System.out.println("하이");
			for (int i = 0; i < bookList.size(); i++) {
				if (bookList.get(i).getKind().equalsIgnoreCase("컴퓨터")) {
				count += bookList.get(i).getRentalPrice();
				}
			}
		}
		if (kind.equalsIgnoreCase("소설")) {
			System.out.println("하이루");
			for (int i = 0; i < bookList.size(); i++) {
				if (bookList.get(i).getKind().equalsIgnoreCase("소설")) {
				count += bookList.get(i).getRentalPrice();
				}
			}
		}
		if (kind.equalsIgnoreCase("만화")) {
			for (int i = 0; i < bookList.size(); i++) {
				if (bookList.get(i).getKind().equalsIgnoreCase("만화")) {
				count += bookList.get(i).getRentalPrice();
				}
			}
		}
		return count;
	}
}
