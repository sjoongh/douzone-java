package day10_collection.ex6.map;

import java.util.*;

class TreeMapEx1 {
	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("ȫ�浿",1000);
		tm.put("��浿",1000);
		tm.put("�̱浿",1000);
		tm.put("Ȳ�浿",1000);
		System.out.println("ȫ�浿 : "+tm.get("ȫ�浿"));
		System.out.println(tm);
	}
}
