package day11_io.ex02.io;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) throws Exception {
		int su1 = 0, su2 = 0;
		System.out.println("데이터 입력 긑은 ctrl + z를 누르세요.");
		
		System.out.println("input = ");
//		while ((su1 = System.in.read()) != -1) {
//			System.out.println(su1 + "\t");
//		}
		try {
			int su;
			while ((su = System.in.read()) != -1) {
				if (su == 10 || su == 13 || su == 32) continue;
				if (su == 113 || su == 81) break;
				
				char ch = (char)su;
				System.out.println(ch);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
//		InputStream is = System.in; // 표준입력
//		
//		try {
//			System.out.println("단일 문자 입력 요망 : ");
////			int num = is.read(); // 예외발생함, '0' ~ '9' : 48 ~ 57(아스키코드)
//			
//			int num = is.read() - 48;
//			is.read(); is.read(); // 문제발생처리 = 자바에서 '문자' 2바이트 처리됨
//			int num2 = is.read() - 48;
//			
//			System.out.println(num+num2);
//		} catch (IOException e) {
////			System.out.println("user error message");
////			System.out.println();
//			e.printStackTrace();
//		}
	}
}
