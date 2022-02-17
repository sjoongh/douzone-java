package day15_network.ex06.net.udp;

import java.io.*;
import java.net.*;

public class UdpServer {
	private final static int PACKSIZE = 100;

	public static void main(String[] args) {
		
		if (args.length != 1) {
			System.out.println("using : DatagramServer port number : ");
			return; // 제어권 넘김
		}

		try {
			int port = Integer.parseInt(args[0]);
			DatagramSocket ds = new DatagramSocket(3000);
			System.out.println("The Server is ready...........");
			
			for (;;) {
				DatagramPacket dp = new DatagramPacket(new byte[PACKSIZE], PACKSIZE);
				ds.receive(dp);
				System.out.println(dp.getAddress()+" "+dp.getPort()+" "+ new String(dp.getData()));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
