package day09_api.ex03.utilPackage;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// =|�� ���� �����ڷ� ���
		StringTokenizer token = new StringTokenizer("���=10|���ڷ�=3|������=|", "=|", true);
		
		while (token.hasMoreTokens()) { // ���� ��Ұ� ����? boolean����
//			System.out.println(token.nextToken());
			
			String str = token.nextToken();
			
			if (str.equals("=")) System.out.println("\t");
			else if (str.equals("|")) System.out.println("\n");
			else System.out.println(str);
		}
		
	}

}
