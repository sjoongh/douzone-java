package day14_gui.ex01.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener {
	
	public MainFrame() {
		setTitle("test");
		setVisible(true);
		setSize(300, 200);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
