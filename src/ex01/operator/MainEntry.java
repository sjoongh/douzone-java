package ex01.operator;

// �ִܻ꽬��������
public class MainEntry {
	public static void main(String[] args) {
		// ��������� : +,-,*,/,%,.....
		int x = 10, y = 20;
		int gob = x * y;
		
		System.out.println("x * y = " + gob);
		System.out.println("x * y = " + (y*x));
		
		System.out.println(x + "*" + y + " = " + (y * x));
		
		System.out.println("\n\n3+4 * 5 = " + (3+4*5));
		System.out.println("3+4 * 5 = " + (3+4)*5);
		
		// ���� (+,-,*,/,%,...) ���� = ����
		System.out.println("\n7 / 3 =" + (7 / 3)); // ��
		System.out.println("\n7 % 3 =" + (7 % 3)); // ������
		
		System.out.println("\n7 / 3.0 = " + (7 / 3.0));
		System.out.println("\n7 / 3.0 = " + (7. / 3.));
		
// 2. ��Ʈ ����
//		int x = 10, y;
//		
//		y = ~10; // ��Ʈ���� - (������ + 1) ===> ��°��
//		
//		System.out.println("x = " + x + "\ty = " + y);
		
		
// 1. ���׿����� : ���� ==> ++, --, ~, .....
//		int x = 10, y;
		
//		y = x++; // �������� : ���Ը���, ���곪��
//		y = ++x; // �������� : �������, ���Գ���
//		y = x--;
		
//		++x; // x++
//		y = x;
//		System.out.println("x= " + x + "\ty = " + y);
	}
}
