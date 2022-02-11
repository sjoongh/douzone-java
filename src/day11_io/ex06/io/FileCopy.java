package day11_io.ex06.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) throws Exception {
		
		// 읽기 객체 - FileInputStream
		InputStream is = new FileInputStream("1.jpg");
		// 쓰기 객체 - FileOutputStream
		OutputStream os = new FileOutputStream("copy.jpg");
		
		// 기존에는 바이트 하나씩만 데이터를 전송했지만
		// byte의 크기를 지정해 데이터를 한번에 전송할 수 있게함
		byte[] buffer = new byte[1024 * 8]; //
		
		long start = System.currentTimeMillis(); // 시작 시간 저장
		
		while (true) {
			int inputData = is.read(buffer); // 버퍼 크기만큼 읽어들임
			if (inputData == -1) break;
			os.write(buffer, 0, inputData);
		}
		long end = System.currentTimeMillis(); // 끝난 시간 저장
		
		System.out.println(end - start);
		
		is.close(); os.close();
		System.out.println("copy success!!");
	}

}
