package day09_api.ex03.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// =|를 전부 구분자로 사용
		StringTokenizer token = new StringTokenizer("사과=10|초코렛=3|샴페인=|", "=|", true);
		
		while (token.hasMoreTokens()) { // 다음 요소가 존재? boolean값임
//			System.out.println(token.nextToken());
			
			String str = token.nextToken();
			
			if (str.equals("=")) System.out.println("\t");
			else if (str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}
		
	}

}
