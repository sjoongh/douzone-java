package day13_thread.ex03.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class InnerMain { // 아우터클래스
	public static void main(String[] args) {
		Frame frame = new Frame("이벤트 처리 - 이너클래스");
		Button btn = new Button("Button-Start");
		
		btn.addActionListener(new ActionListener() { // 익명클래스
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent 발생했습니다.");
				System.out.println(e.getActionCommand());
				System.out.println(e.getSource());
			}
		});
		
		// Frame event
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(300, 200);
		frame.setLocation(300, 150);
	}
}

// solution 1
//public class InnerMain {
//	
//	class EventHandler implements ActionListener {
//		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println("ActionEvent 발생했습니다.");
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
//		}
//
//	}
//	
//	public static void main(String[] args) {
//		Frame frame = new Frame("이벤트 처리 - 이너클래스");
//		Button btn = new Button("Button-Start");
//		
//		// 1.
//		EventHandler handler = new InnerMain().new EventHandler();
//		btn.addActionListener(handler);
//		
//		frame.add(btn);
//		frame.setVisible(true);
//		frame.setSize(300, 200);
//		frame.setLocation(300, 150);
//	}
//}
