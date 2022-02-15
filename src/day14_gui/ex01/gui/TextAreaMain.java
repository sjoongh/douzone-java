package day14_gui.ex01.gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaMain extends Frame {
	
	public TextAreaMain(String str) {
		setTitle("FirstName");
		setBackground(Color.YELLOW);
		setVisible(true);
		setBounds(500, 350, 500, 300);
	
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
