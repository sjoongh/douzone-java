package day11_io.ex08.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx {
	public static void main(String[] args) 
			throws FileNotFoundException, IOException, ClassNotFoundException {
		InputStream is = new FileInputStream("grade.txt");
		ObjectInputStream oos = new ObjectInputStream(is);
		
		Grade vo = (Grade)oos.readObject();
		oos.close();
	}
}
