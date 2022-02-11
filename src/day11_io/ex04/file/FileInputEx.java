package day11_io.ex04.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		
		try {
//			OutputStream os = new FileOutputStream("memo.txt"); // 상대경로
			OutputStream os = new FileOutputStream("E:/KOSA/test2.txt"); // 상대경로
			
			while (true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine()+"\r\n";
				
				if (str.toUpperCase().equals("EXIT\r\n")) break;
				
				os.write(str.getBytes()); // 예외발생
			}
			
			System.out.println("memo.txt save success!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
