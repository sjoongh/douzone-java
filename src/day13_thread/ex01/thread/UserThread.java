package day13_thread.ex01.thread;

public class UserThread extends Thread {
	
	String name;
	
	public UserThread(String name) {
		this.name = name;
	}

	@Override
	public void run() { // 스레드 실행부(구현부)
		super.run();
	}
	
}
