package day06_method_oop.ex01.method;

public class methodEx {

	// 4. 매개변수 있고 리턴타입 있는 경우
	public static String name(String n) {
		return n;
	}
	
	public static String name(String n, int x) {
		String str = null;
		
		for (int i = 0; i < x; i++) {
			str += n + "\n";
			
		}
		
		return str;
	}
	
	public static void main(String[] args) {
		String name = name("hello");
		System.out.println(name);
		
		System.out.println(name("world"));
	}

}
