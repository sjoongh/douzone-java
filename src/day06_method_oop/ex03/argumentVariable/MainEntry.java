package day06_method_oop.ex03.argumentVariable;

public class MainEntry {

	public static void main(String[] args) {
		plus("A","B");
		plus("kbs","mbc","KOSA");
		plus(3);
		plus(1,2,3,4,5,6,7,8);
		plus(100, 200);
	}
	
	public static void plus(int...x) { // 가변길이 배열
		
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		
		System.out.println("sum = "+ sum);
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x.hashCode()+"["+i+"]" + sum);
//		}
	}
	public static void plus(String...x) {
		String str = "";
		
		for (int i = 0; i < x.length; i++) {
			str += x[i];
		}
		System.out.println(str);
	}

}
