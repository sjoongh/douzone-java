package day11_io.ex06.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UniCopy {

	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		
		URL url = new URL("https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png"); // 예외발생
		
		InputStream is = url.openStream();
		
		OutputStream os = new FileOutputStream("google.jpg");
		
		byte[] buffer = new byte[1024 * 8]; //
		
		while (true) {
			int inputData = is.read(buffer); // 버퍼 크기만큼 읽어들임
			if (inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		long end = System.currentTimeMillis(); // 끝난 시간 저장
		
		
		is.close(); os.close();
		System.out.println("copy success!!");
	}

}
