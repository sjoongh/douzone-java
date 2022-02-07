package day08_oop.ex09.wraper;

class Point { }

public class MainEntry {

	public static void main(String[] args) {
		
		Integer la = new Integer("10");
		Integer lb = new Integer("10");
		String su = "30";
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.getClass().getName()+'@'+Integer.toHexString(pt.hashCode()));
		System.out.println();
		System.out.println(la);
		System.out.println(la.getClass().getName()+'@'+Integer.toHexString(la.hashCode()));
		
		int x = 77;
		double y = 5.5;
		System.out.println(x + ", " + y);
		
		x = (int)y;
		System.out.println(x + ", " + y);
		
		// Boxing vs UnBoxing
		int c = la.intValue(); // jdk 4.x ������ ����ϴ� �޼ҵ�
		int d = lb; // jdk 5.x ���ĺ��� autoboxing, unboxing
		System.out.println("-----------------");
		System.out.println(c + ", " + d);
		int num = Integer.parseInt(su);
		
		System.out.println(c + num);
		System.out.println(c + d);
		System.out.println(la.MAX_VALUE);
		System.out.println(la.MIN_VALUE);
		
		Double dd = new Double(12.34);
		System.out.println(dd);
		System.out.println(dd.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println("======================");
//		c = (int)dd;
		c = (int)dd.doubleValue();
		System.out.println(c);
		System.out.println("=======================");
		
		int e = Integer.parseInt("123");
		int f = Integer.parseInt("111111", 2);
		System.out.println(e);
		System.out.println(f);
	}
}
