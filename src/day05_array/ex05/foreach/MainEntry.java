package day05_array.ex05.foreach;

public class MainEntry {

	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8};
		
		System.out.println("***** 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+ "\t");
		}
		
		// for(자료형 변수명 : 컬렉션명 or 배열명 { 반복구문 })
		System.out.println("\n***** for each 출력");
		for (int item : a) {
			System.out.print(item+'\t');
		}
		
		System.out.println("\n내림차순");
		for (int i = a.length -1; i >= 0; i--) {
			System.out.print(a[i]+"\t");
		}
	}

}
