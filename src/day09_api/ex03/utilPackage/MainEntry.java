package day09_api.ex03.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // system�� ���� �ִ� ��¥ ����.
		
		System.out.println(c.get(Calendar.YEAR)+ "��");
		System.out.println((c.get(Calendar.MONTH)+1)+ "��"); // ���� 0���� ������
		System.out.println(c.get(Calendar.DATE)+ "��");
		System.out.println("\n==========================\n");
		
		Date date = new Date();
		int h = date.getHours();
		int m = date.getMinutes();
		int s = date.getSeconds();
		
		System.out.println("���� �ð��� "+h+" : "+m+" : "+s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2022, 12, 20, 0, 0);
		
		if (c1.after(c2) ) {
			System.out.println("���� �ð��� : "+c1);
		} else {
			System.out.println("error!");
		}
	}

}
