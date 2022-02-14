package day13_thread.ex01.thread;

public class MainEntry {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		t1.start(); // run() 유도
//		t1.run(); // 명시적인 호출은 스레드 작업이 안남
	}
}
