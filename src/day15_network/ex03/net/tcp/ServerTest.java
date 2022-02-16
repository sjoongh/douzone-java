package day15_network.ex03.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;

		System.out.println("server setart");
		try {
			new ServerSocket(9000); // socket 1
			s = ss.accept(); // socket 2
			
			// I/O
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
			
			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			String msg = "hi";
			os.write(msg.getBytes());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				s.close();
				ss.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} 
	}
}
