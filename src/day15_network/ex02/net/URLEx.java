package day15_network.ex02.net;

import java.io.*;
import java.net.*;

public class URLEx {

	public static void main(String[] args) 
			throws MalformedURLException, IOException {
		
		URL url = new URL("http://ec2-3-34-126-3.ap-northeast-2.compute.amazonaws.com/"); // 예외 발생
		
		System.out.println("프로토콜 : "+url.getProtocol());
		System.out.println("호스트와 포트 : "+url.getAuthority());
		System.out.println("호스트 : "+url.getHost());
		System.out.println("포트 : "+url.getPort());
		System.out.println("경로 : "+url.getPath());
		System.out.println("질의 : "+url.getQuery());
		System.out.println("파일명 : "+url.getFile());
		System.out.println("참조 : "+url.getRef());
	}

}
