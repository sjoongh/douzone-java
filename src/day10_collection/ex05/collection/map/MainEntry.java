package day10_collection.ex05.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// key / value 한쌍으로 처리. (set + list);
public class MainEntry {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("kosa", "th2");
		map.put("kbs", 12345);
		map.put("it", "147");
		map.put("kosa", "th2");
		
		System.out.println("요소 개수 : "+map.size());
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id && password input");
			System.out.println("id : ");
			String id = sc.nextLine();
			System.out.println("password : ");
			String pwd = sc.nextLine().trim();
			
			// 부정연산자
			if (!map.containsKey(id) ) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요");
				continue;
			} else {
				if (!map.get(id).equals(pwd) ) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요");
				} else {
					System.out.println("id와 pwd가 일치합니다.");
					break;
				}
			}
		}
	}
}
