package day05_array;

public class MainEntry2 {
	public static void main(String[] args) {
		//1.
		int[][] a = new int[2][3];  // ��ũ�� ��ũ��
		a[0][0] = 1;  //�ʱ�ȭ
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		//2.
		int[][] a2 = new int[][] { {1, 2, 3}, {4, 5, 6 } };
		//3.
		int[][] a3 =  { {1, 2, 3}, {4, 5, 6 } };
		
		//�迭 �� ���
		System.out.println("a3[0][2] = " + a3[0][2]);
		System.out.println("a3[1][1] = " + a3[1][1]);
		System.out.println("\n+++++++++++++++++++++++");
		System.out.println("�迭�� ��ũ�� : " + a3.length);  // ���� ũ��
		System.out.println("�迭�� ��ũ�� : " + a3[0].length);  // ���� ũ��
		
		for(int i = 0; i < 2; i++) { // row
			for(int j = 0; j < 3; j++ ) {  // col
				System.out.print( a3[i][j] + "\t" );
			} // j end
			System.out.println();
		} // i end
		
		System.out.println("-------------------------------------");
		for(int i = 0; i < a3.length; i++) { // row
			for(int j = 0; j < a3[i].length ; j++ ) {  // col
				System.out.print( a3[i][j] + "\t" );
			} // j end
			System.out.println();
		} // i end
	}
}







