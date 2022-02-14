package day11_io.ex0.randomAccessFile;
import java.io.*;

public class RandomAccessFileEx {
	public static void main(String[] args) 
			throws FileNotFoundException,IOException { // 예외처리 위임
		
		RandomAccessFile raf = 
				new RandomAccessFile("example.txt", "rw");  // 예외발생
		
		for (int i = 0; i <= 10; i++) {
			
			raf.seek(i * 100);  // 파일 포인터 위치 변경 --> 100만큼
			raf.writeInt(i); // 정수형을 4등분으로 쪼개서 파일에씀
		}
		
		System.out.println("성공!!!");
		raf.close();
		
	}
}
