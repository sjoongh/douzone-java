package day08_oop.ex08.api;

class Circle {
	int x,y;
}

public class EqualsMain {

	public static void main(String[] args) {
		// class ȣ�⸶�� �޸𸮻� ���ο� ������ ������
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1 : "+c1.hashCode());
		System.out.println("c2 : "+c2.hashCode());
		
		int x = 3, y = 3; // �⺻�ڷ����� ���� ���� 3�� �޸𸮻� ������
		System.out.println("�⺻ �ڷ��� ��");
		if (x == y) System.out.println("����");
		else System.out.println("�ٸ���");
		

		System.out.println("���� �ڷ��� ��");
		String str1 = new String("kosa"); // �����ڷ����� �������� �޸��ּҸ� ����Ű������
		String str2 = new String("kosa"); 
		
		if (str1 == str2) System.out.println("����");
		else System.out.println("�ٸ���");
		
		// �ذ��� : equals()
		System.out.println("********* equals() method�� *******");
//		if (str1.equals(str2)) System.out.println("����"); // ��ҹ��� ����o
		if (str1.equalsIgnoreCase(str2)) System.out.println("����"); // ��ҹ��� ����x
		else System.out.println("�ٸ���");
	}

}
