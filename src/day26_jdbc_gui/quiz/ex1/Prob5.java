package day26_jdbc_gui.quiz.ex1;

import java.io.BufferedReader;
import java.io.FileReader;

public class Prob5 {
	public static void main(String[] args) {
		String fileName = "./src/day26_jdbc_gui/quiz/ex1/data.txt";
		
		makeVariable(fileName);
	}

	private static void makeVariable(String fileName) {
		try {
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			String line;
			String test;
			while ((line=br.readLine())!=null) {
				 StringBuilder result = new StringBuilder();
			        boolean check = false;
			        for (int i = 0; i < line.length(); i++) {
			            char fincChar = line.charAt(i);
			            if (fincChar == '_') {
			            	check = true;
			            } else {
			                if (check) {
			                    result.append(Character.toUpperCase(fincChar));
			                    check = false;
			                } else {
			                    result.append(Character.toLowerCase(fincChar));
			                }
			            }
			        }
			        System.out.println(result.toString());
			}
			}
		 catch (Exception e) {
			System.out.println("메모장이 없습니다.");
		}
	}
}
