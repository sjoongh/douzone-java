package day13_thread.ex01.thread;

public class UserRunnable implements Runnable {

	
	String name;
	
	public UserRunnable(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public void run() { // 스레드 실행부
//		System.out.println("Runnable interface run() call");
		System.out.println(name);
		
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
//		Ruannable u1 = new UserRunnable("u1");
//		Thread t1 = new Thread(u1);
//		
//		Thread t2 = new Thread(new UserRunnable("u2"));
//		Thread t3 = new Thread(new UserRunnable("u3"));
		
		new Thread(new UserRunnable("u1"));
		new Thread(new UserRunnable("u2"));
		new Thread(new UserRunnable("u3"));
		
//		t1.start();
//		t2.start();
//		t3.start();
	}
	
	
}
