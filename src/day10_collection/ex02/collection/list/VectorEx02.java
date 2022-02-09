package day10_collection.ex02.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		int i;
		Date date = new Date();
		Vector v = new Vector(3, 5);
		
		v.addElement("자바"); // string
		v.addElement(new Double(10.2)); // double
		v.addElement(date); // object

		System.out.println("------- 3개 객체 추가 -----------------------");
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		for (i=0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
		System.out.println("------- 10개 객체 추가 -----------------------");
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		
		System.out.println("------- Vector 내용 출력 -----------------------");
		Enumeration enu = v.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement()+"  ");
		}
		System.out.println("--------- 객체 내용 포함 확인 -----------------");
		if (v.contains("자바")) System.out.println("자바 문자열 포함됨");
		
		System.out.println("10.2 객체의 위치는? "+v.indexOf(new Double(10.2)));
		System.out.println(v.get(v.indexOf(date)));
		
		// date 객체 삭제
		v.removeElementAt(v.indexOf(date));
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		System.out.println(v);
		
		for (i = 0; i < v.size(); i++) {
			v.removeElementAt(i);
		}
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		System.out.println(v);
		System.out.println();
		for (i = 0; i < v.size(); i++) {
//			v.removeElementAt(i);
//			v.remove(0);
//			v.removeAllElements();
//			v.remove(10.2);
			v.remove("자바");
		}
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		System.out.println(v);
		System.out.println("\n\n");
		v.trimToSize();
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		
		v.removeAllElements();
		System.out.println("size : "+v.size()+", capacity : "+v.capacity());
		
	}

}
