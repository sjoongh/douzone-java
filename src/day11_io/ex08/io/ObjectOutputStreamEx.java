package day11_io.ex08.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamEx {

	public static void main(String[] args) throws IOException {
		Grade vo = new Grade();
		
		vo.setScore(90);
		vo.setSubject("미술");
		
		OutputStream os = new FileOutputStream("grade.txt");
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		oos.writeObject(vo);
		oos.close();
	}

}
