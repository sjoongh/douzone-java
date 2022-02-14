package day13_thread.ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
//		Thread t1 = new Thread();
		Thread t1 = new UserThread("t1");
		Thread t2 = new UserThread("t2");
		Thread t3 = new UserThread("t3");
		
		t2.setPriority(10);
		t1.setPriority(2);
		t3.setPriority(5);
		
		
//		t1.start(); // run() 유도
//		t1.run(); // 명시적인 호출은 스레드 작업이 안남
		
		t1.start(); // run() 유도한다.
		t2.start();
		t3.start();
		System.out.println("===================");
		System.out.println(t3.getPriority());
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&");
		System.out.println(t2.getName());
		System.out.println(t1.getName());
		System.out.println(t3.getName());
		
		System.out.println("**********************");
		System.out.println(t2.getId());
	}
}
