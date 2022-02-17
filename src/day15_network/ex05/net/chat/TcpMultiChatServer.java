package day15_network.ex05.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

// 원래는 분리해서 해야함
public class TcpMultiChatServer {
	
	HashMap clients; // key, value
	ServerSocket ss = null; // socket 1
	Socket s = null; // socket 2
	
	public TcpMultiChatServer() { // 생성자함수
		clients = new HashMap();  // 객체 생성
		Collections.synchronizedMap(clients); // 동기화
	}
	
	public void start() {
		try {
			ss = new ServerSocket(7000);
			System.out.println("server start! ready to chat");
			
			while (true) {
				s = ss.accept();
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속하셨습니다.");
				ServerReceiver thread = new ServerReceiver(s);
				thread.start(); // run()메소드가 유도
			}
		} catch (Exception e) { System.out.println("서버 접속 실패!!"); }
	}
	
	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // iterator로 key값 분리 & 출력
		
		while (it.hasNext()) { // 다음요소가 있다면
			try {
				DataOutputStream dos = (DataOutputStream)clients.get(it.next()); // 다음요소 가져옴
				dos.writeUTF(msg);
			} catch (Exception e) { e.printStackTrace(); }
		}
	}
	
	
	class ServerReceiver extends Thread { // inner class
		Socket s; // 클라이언트 소켓
		DataInputStream dis;
		DataOutputStream dos;
		String name;

		public ServerReceiver (Socket s) { // 생성자 함수
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 네트워크를 통해서 읽기
				dos = new DataOutputStream(s.getOutputStream()); // 네트워크를 통해서 쓰기
 			} catch (Exception e) {
 				System.out.println("서버 리시브 실패!!");
			}
		} // constructor end
		
		@Override
		public void run() { // 스레드 실행부(구현부)
			try {
				name = dis.readUTF();
				sendToAll("#"+name+" 님이 입장하셨습니다."); // outerclass의 user method
				clients.put(name, dos); // MashMap에 넣기
				System.out.println("현재 서버 접속자 수는 : "+clients.size()+" 입니다."); // 접속자 수 확인
				
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				sendToAll("#"+name+" 님이 나가셨습니다.");
				clients.remove(name); // 접속자 수 제거
				System.out.println("["+s.getInetAddress()+":"+s.getPort()+"] 에서 접속 종료합니다.");
				System.out.println("현재 서버 접속자 수는 : "+clients.size()+" 입니다."); // 접속자 수 확인
			}
		}
		
	}

	public static void main(String[] args) {
		new TcpMultiChatServer().start();
	}

}
