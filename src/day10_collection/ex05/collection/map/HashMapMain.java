package day10_collection.ex05.collection.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("상윤", new Integer(90));
		map.put("태문", new Integer(55));
		map.put("봉제", new Integer(85));
		map.put("중호", new Integer(100));
		map.put("지호", new Integer(75));
		
		System.out.println(map);
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("name"+e.getKey() + ", score :"+ e.getValue());
		}
		
		set = map.keySet();
		System.out.println(set);
		
		Collection values = map.values();
//		System.out.println();
		it = values.iterator();
		
		int tot = 0;
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			tot += i.intValue();
		}
		
		System.out.println("total : "+tot);
		System.out.println("평균 : "+(float)tot / set.size());
		System.out.println("max score : "+Collections.max(values));
	}

}
