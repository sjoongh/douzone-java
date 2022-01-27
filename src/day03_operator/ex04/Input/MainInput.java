package day03_operator.ex04.Input;

public class MainInput {
	// (String[] 아무거나지정(args or x))
	public static void main(String[] args) {
		System.out.println("string, int = ");
		
		String str = args[0];
		// 형변환 두 줄
//		String strSu = args[1];
//		int su = Integer.parseInt(strSu);
		// 형변환 한 줄
		int su = Integer.parseInt(args[1]);
		
		System.out.println(str);
		System.out.println(su + 33);
	}

}
