package day06_method_oop.ex01.method;

public class methodEx {

	// 4. �Ű����� �ְ� ����Ÿ�� �ִ� ���
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
