package ex02.operator;
// �ִܻ꽬��������
public class MainEntry {
	public static void Main(String[] args) {
		// ���迬���� : >, <, >=, <=, ==(����), !=(�����ʴ�)
		
		int x = 2, y = 20;
		
		if (x != y)
			System.out.println("���� �ʽ��ϴ�.");
		else
			System.out.println("�����ϴ�.");
		
		// ���׿����� :(����)? �� : ����
		String msg = null; // msg =""
		msg = (x != y) ? "���� �ʽ��ϴ�" : "�����ϴ�.";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		
		result = (a > b) ? a : (b > c) ? a = (b < c) ;
		System.out.println(result);
		
	// 1. shift ������ : <<, >>, <<<, >>>
//	int x = 8, result;
	
//	result = x << 2; // left shift : ������ * 2 ^ bit ��
//	result = x >> 3; // right shift : ������ / 2 ^ bit ��
	
//	System.out.println("left shift" + result); // 32
//	System.out.println("right shift" + result); // 1
	
	}
}
