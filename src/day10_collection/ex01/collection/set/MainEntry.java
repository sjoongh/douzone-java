package day10_collection.ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 1) Set : ��������, �ߺ�������� ����
public class MainEntry {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet(); -> �ֱٹ����� �ڿ� type���� x
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Ű����");
		hs.add("���콺");
		hs.add("��");
		hs.add("����");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add(12.34);
		
		System.out.println("��� ���� : "+hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // ��Ҹ� ������ ���
		}
		
		System.out.println("------------------------");
		for(Object item : hs2) {
			System.out.println(item);
		}
		
		System.out.println("------------------------");
		System.out.println(hs);
		
		it = hs2.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

//import java.util.HashSet;
//import java.util.Set;
//
//// 1) Set : ��������, �ߺ�������� ����
//public class MainEntry {
//	public static void main(String[] args) {
//		Object[] objArr = { "1", new Integer(1), "2", "3", "4", "t", "4", 1, 12.34 };
//		
//		// �ڷ��� type�� �ٸ��� �ߺ� ���� x
//		Set set = new HashSet();
//		
//		for (int i = 0; i < objArr.length; i++) {
//			set.add(objArr[i]);
//		}
//		
//		System.out.println(set);
//	}
//
//}
