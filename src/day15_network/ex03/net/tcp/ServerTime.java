package day15_network.ex03.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {
	public static void main(String[] args) {
		int port = 7000;
		
		try {
			System.out.println("server setart");
			ServerSocket ss = new ServerSocket(port); // socket 1
			
			while (true) {
				Socket s = ss.accept(); // socket 2 
				
				OutputStream os = s.getOutputStream(); // net 통해서 출력
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date()); // 서버측 날짜
				oos.flush(); // 데이터 전부 내보내기
				s.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
