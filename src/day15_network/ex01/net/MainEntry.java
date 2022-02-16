//package day15_network.ex01.net;
//
//import java.net.InetAddress;
//import java.rmi.UnknownHostException;
//
//public class MainEntry {
//
//	public static void main(String[] args) {
//		String host = "211.200.90.77";
//		
//		try {
//			InetAddress[] address = InetAddress.getAllByName(host);
//			
//			for (InetAddress item : address) {
//				System.out.println(item.getCanonicalHostName());
//			}
//		} catch (UnknownHostException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
