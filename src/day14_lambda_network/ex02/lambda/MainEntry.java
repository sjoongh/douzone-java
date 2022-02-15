package day14_lambda_network.ex02.lambda;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
		System.out.println("Thread Start");
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread End");
		});

//		t.start();
//		System.out.println(t);
		
		System.out.println("====================");
		List<String> list = new ArrayList();
		list.add("java");
		list.add("jsp");
		list.add("react");
		
		// (매개변수 목록) -> { 실행문 }
		list.forEach((item) -> System.out.println(item));;
		
		System.out.println(list);
	}
}
