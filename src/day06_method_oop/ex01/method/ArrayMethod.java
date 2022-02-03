package day06_method_oop.ex01.method;

public class ArrayMethod {

	public static void main(String[] args) {
		int x = 3, y = 5;
		
		int result = methodEx(x,y);
		System.out.println(result);
		
		int[] arrResult = methodEx2();
		
		for (int item : arrResult) {
			System.out.println(item + " ");
		}
	}
	
	public static int[] methodEx2() {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		return arr;
	}
	
	public static int methodEx(int x, int y) {
		return x+y;
	}

}
