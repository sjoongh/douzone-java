package day14_gui.ex01.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaMain extends Frame {
	TextArea ta;
	Button btn;
	
	public TextAreaMain(String str) {
		setTitle("FirstName");
		setBackground(Color.YELLOW);
		setVisible(true);
		setBounds(500, 350, 500, 300);
		
		btn = new Button("Button1");
		ta = new TextArea("문장을 넣으세요", 5, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		this.add(btn);
//		btn.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void actionperformed(WindowEvent e) {
				System.exit(0);
			}
		});
		
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			System.out.println(e.getActionCommand());
//			System.out.println(e.getSource());
//		}
		
	
		addWindowListener(new WindowAdapter() { // 익명 클래스
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) {
		new TextAreaMain("새창 띄우기");

	}

}
