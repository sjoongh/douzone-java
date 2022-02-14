package day11_io.ex0.randomAccessFile;

import java.io.*;

public class FileReaderEx {
	public static void main(String[] args) 
			throws IOException { //
		
		int i =0;
		String file;
		BufferedReader br = new BufferedReader(
			      new InputStreamReader(System.in));
		
		System.out.println("읽어올 파일을 입력하세요.");
		file = br.readLine();
		
		System.out.println(file + "파일읽는중.. ");
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		while( (i = reader.read() ) != -1 ) {
			System.out.print((char)i + " ");
			if( fr.equals("\n")) System.out.println();
		}
		
		fr.close();
	}
}










