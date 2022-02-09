package day10_collection.ex01.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 1) Set : 순서없고, 중복허용하지 않음
public class MainEntry {
	public static void main(String[] args) {
//		HashSet<String> hs = new HashSet(); -> 최근문법은 뒤에 type지정 x
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("키보드");
		hs.add("마우스");
		hs.add("컵");
		hs.add("볼펜");
		
		HashSet<Integer> hs2 = new HashSet<Integer>();
		hs2.add(100);
		hs2.add(3);
		hs2.add(1000);
//		hs2.add(12.34);
		
		System.out.println("요소 개수 : "+hs.size());
		
		Iterator it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // 요소를 꺼내서 출력
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
//// 1) Set : 순서없고, 중복허용하지 않음
//public class MainEntry {
//	public static void main(String[] args) {
//		Object[] objArr = { "1", new Integer(1), "2", "3", "4", "t", "4", 1, 12.34 };
//		
//		// 자료형 type이 다르면 중복 배제 x
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
