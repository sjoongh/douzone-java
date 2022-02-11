package day11_io.ex03.bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class MainEntry {
	public static void main(String[] args) 
			throws IOException { // 예외처리 위임, java는 플랫폼에 독립적이므로, JVM에게 예외 발생시 위임
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("더할 숫자 입력하세요.");
		
		int su1, su2;
//		String s1 = br.readLine();
//		String s2 = br.readLine();
		
		su1 = Integer.parseInt(br.readLine());
		su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1 + su2);
		
//		InputStream is = System.in;
//		Reader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		
		String str = br.readLine(); // 예외발생
		System.out.println(str);
	}
}
