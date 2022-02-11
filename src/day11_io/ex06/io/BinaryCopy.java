package day11_io.ex06.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) {
		File src = new File("C:/Windows/explorer.exe"); // 복사파일
		File dist = new File("E:\\KOSA\\2022\\ie.dat");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dist);
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			while((c=bis.read()) != -1) {
				bos.write((char)c);
			}
			System.out.println("파일 복사 성공");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {
//				bis.close(); fis.close(); bos.close(); bis.close();
//			} 
//			catch {
//				
//			}
		}
	}

}
