package day07_oop.quiz;

import java.util.Scanner;

public class test2 {
	
	public test2() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�л� ���� �Է��ϼ���.");
	
	String[] name = new String[sc.nextInt()];
	String[][] students = new String[name.length][5];
	String[] grade = new String[name.length];
	int[] rank = new int[name.length];
	int cnt = 0;
	
	for (int i = 0; i < name.length; i++) {
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		students[i][0] = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		students[i][1] = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		students[i][2] = sc.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		students[i][3] = sc.next();
		
		if ((Integer.parseInt(students[i][1]) < 0) || (Integer.parseInt(students[i][1]) > 100) ||
				(Integer.parseInt(students[i][2]) < 0) || (Integer.parseInt(students[i][2]) > 100) ||
				(Integer.parseInt(students[i][3]) < 0) || (Integer.parseInt(students[i][3]) > 100)) {
			System.out.println("get out");
			cnt += 1;
			break;
		}
		
		total(name, Integer.parseInt(students[i][1]), Integer.parseInt(students[i][2]), Integer.parseInt(students[i][3]));
		int answer = Integer.parseInt(students[i][1])+Integer.parseInt(students[i][2])+Integer.parseInt(students[i][3]);
		average(answer);
		grade(average(answer));
		output(students[i][0], answer);
	}
	sc.close();
	}
}
