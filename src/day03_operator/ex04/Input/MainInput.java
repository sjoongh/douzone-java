package day03_operator.ex04.Input;

public class MainInput {
	// (String[] �ƹ��ų�����(args or x))
	public static void main(String[] args) {
		System.out.println("string, int = ");
		
		String str = args[0];
		// ����ȯ �� ��
//		String strSu = args[1];
//		int su = Integer.parseInt(strSu);
		// ����ȯ �� ��
		int su = Integer.parseInt(args[1]);
		
		System.out.println(str);
		System.out.println(su + 33);
	}

}
