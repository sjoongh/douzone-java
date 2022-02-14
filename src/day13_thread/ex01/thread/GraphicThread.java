package day13_thread.ex01.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

public class GraphicThread 
				extends JFrame implements Runnable {
	
	int num, x, y;
	Color color;
	Random random; // 랜덤 함수 생성
	
	public GraphicThread(int num) { // 생성자 함수 - 초기화
		this.num = num;
		color = Color.red; // 대소문자 같은 색깔임
		random = new Random(); // 난수 초기화
		
		setSize(500, 400);
		setVisible(true);
		setLocation(300, 150);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void run() {
		Rectangle rect = getBounds();
		
		for (int i = 0; i < num; i++) {
		x = random.nextInt(rect.width);
		y = random.nextInt(rect.width);
		
		repaint();
		
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);
//		g.fillRect(x, y, 30, 30);
		g.fillOval(x, y, 3, 3);
		
	}

	public static void main(String[] args) {
		// 2.
		new Thread(new GraphicThread(2000)).start();
		
		// 1.
//		GraphicThread gframe = new GraphicThread(2000);
//		Thread t = new Thread(gframe);
//		t.start();
	}
}
