package day15_network.ex01.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.rmi.UnknownHostException;

public class InetAddressMain {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strUrl = null;
		InetAddress[] address;
		
		System.out.println("site address = ");
		
		try {
			strUrl = br.readLine();
			address = InetAddress.getAllByName(strUrl);
			
			for (int i = 0; i < address.length; i++) {
				System.out.println(address[i]);
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
