package day04_controller.ex03.Switch;

import java.util.Scanner;

public class MainSwitch {
	
	public static void main(String[] args) {
		
//		System.out.println("����� ����Ʈ = ");
//		int point = new Scanner(System.in).nextInt();
//		
//		switch(point) { // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
//		case 1: System.out.print("����"); break;
//		case 2: System.out.print("�뱸"); break;
//		case 3: System.out.print("�λ�"); break;
//		default:
//			System.out.print("�߸� �����ϼ̽��ϴ�. s, d, b, j�߿����� �����ϼ���......");
//			System.exit(0);
//		}// end switch
//		
//		System.out.println("��(��) �����ϼ̽��ϴ�.");
		System.out.print("����� ����Ʈ  = ");
	      int point = new Scanner(System.in).nextInt();   // integer data
	      
	      switch( point ) {  // ���� - ������, ������(long�� ����), �Ǽ��� �ȵ�
	         case 1 :   System.out.print("�� ");       //  break;
	         case 2 :   System.out.print("�ǾƳ� ");    //  break;
	         case 3 :   System.out.print("��� ");     //  break;
	         
	      } // end switch
	      
	      System.out.println("��ǰ�� ��÷ �Ǽ̽��ϴ�. �����մϴ�~~ ^^");
	}
}
