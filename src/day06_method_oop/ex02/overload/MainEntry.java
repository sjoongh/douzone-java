package day06_method_oop.ex02.overload;

public class MainEntry {

	public static void line() {
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		line(3,5);
		
		line();
		line(5,3);
		line();
		
		line("*", 10);
		line();
		line(3);
	}
	
	public static void line(String str, int n) {
		for (int i = 1; i <= n; i++) {
			System.out.print(str + " ");
		}
		System.out.println();
	}
	
	public static void line(int x, int n) {
		int temp;
		
//		if (x > n) {
//			int t = x;
//			x = n;
//			n = t;
//		} 
		// or »ïÇ×¿¬»êÀÚ
		
		temp = (x > n) ? x : n;
		
		for (int i = n; i <= temp; i++) {
			System.out.print("&");
		}
		System.out.println();
	}
	
	public static void line(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println("===========");
		}
	}
}
