package day10_collection.ex02.collection.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(100);
		System.out.println(v.size()+" 	/ 	"+v.capacity()); // 0 / 10
		
		Vector<Integer> v2 = new Vector<Integer>(3, 4); // �ʱ�뷮, �����뷮
		v2.add(2);
		v2.add(new Integer(333));
		v2.add(20);
		v2.add(23);
		v2.add(55);
		v2.add(12);
		v2.add(88);
		v2.add(333);
		v2.add(88);
		
		System.out.println(v.size() +" 	 /	 "+v.capacity());
		
		System.out.println("------------iterator() method---------------");
		Iterator it = v2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("----------- get() method -----------------");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("----------- sort result -----------------");
		Collections.sort(v2);
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i));
		}
		
		System.out.println("----------- elementsAt() method -----------------");
		for (int i = 0; i < v2.size(); i++) {
			Integer num = v2.elementAt(i);
			System.out.println(num.toString());
		}
		
		System.out.println("----------- trimToSize() method -----------------");
		System.out.println(v2.size()+" 	/ 	"+v2.capacity());
		v2.trimToSize(); // capacity �����ϱ�
		System.out.println(v2.size()+" 	/ 	"+v2.capacity());
	}

}
