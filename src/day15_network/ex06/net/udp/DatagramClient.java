package day15_network.ex06.net.udp;

import java.io.*;
import java.net.*;

public class DatagramClient {
	public static void main(String[] args) {
		DatagramPacket dp = null;
		DatagramSocket ds = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		int port = 5000;
		String str;
		byte[] b;
		
		try {
			System.out.println("@@@ File UDP Client @@@");
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("전송 대상(server ip) = ");
			String ipAddress = br.readLine();
			System.out.println("전송 파일(파일명.확장자)");
			String fileName = br.readLine();
			
			File file = new File(fileName);
			
			if (!file.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				System.exit(0);
			}
			
			ds = new DatagramSocket();
			InetAddress ip = InetAddress.getByName(ipAddress);
			str = "start";
			b = str.getBytes();
			
			dp = new DatagramPacket(b, b.length, ip, port);
			ds.send(dp);
			
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
			b = new byte[65536];
			
			while (true) {
				int cnt = dis.read(b, 0, b.length);
				if (cnt == -1) break;
				dp = new DatagramPacket(b, cnt, ip, port);
				ds.send(dp);
			}
			
			str = "end";
			b = str.getBytes();
			
			dp = new DatagramPacket(b, b.length, ip, port);
			ds.send(dp);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				dis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
