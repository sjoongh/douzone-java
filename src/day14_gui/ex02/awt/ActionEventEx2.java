package day14_gui.ex02.awt;
import java.awt.*;
import java.awt.event.*;
class  ActionEventEx2 extends Frame implements ActionListener{
	TextArea ta;
	Button b1, b2;
	public ActionEventEx2(String str){
		super(str);
		ta = new TextArea("==��ư�� Ŭ���ϼ���===\n");
		b1 = new Button("<=��ư");
		b2 = new Button("��ư=>");
		b1.addActionListener(this);
		b2.addActionListener(this);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		add("Center", ta);
		add("South",p);
		setSize(300,200);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		ta.append(e.getActionCommand()+" �������ϴ�\n");
	}
	public static void main(String[] args) 
	{
		new ActionEventEx2("Action �̺�Ʈ");

	}
}
