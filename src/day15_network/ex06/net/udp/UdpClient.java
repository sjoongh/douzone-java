package day15_network.ex06.net.udp;

import java.io.*;
import java.net.*;

public class UdpClient {
	private final static int PACKSIZE = 100;

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("using : DatagramServer port number : ");
			return; // 제어권 넘김
		}
		
		DatagramSocket ds = null;
		try {
			InetAddress host = InetAddress.getByName(args[0]); // 서버 ip
			int port = Integer.parseInt(args[1]);
			
			ds = new DatagramSocket();
			byte[] data = "Hello Server KOSA th2".getBytes();
			DatagramPacket dp = new DatagramPacket(data, data.length, host, port);
			
			ds.send(dp);
			
			ds.setSoTimeout(2000); // 2초뒤 종료
			dp.setData(new byte[PACKSIZE]);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ds != null) ds.close();
		}
	}

}
