package day10_collection.quiz;

import java.util.Scanner;
import java.util.Vector;

public class MemberManager {
	Scanner sc = new Scanner(System.in);
	Vector<Member> members = new Vector<Member>();
	public void Run() {
		int answer = 0;
		while ((answer = select()) != 0) {
			switch(answer) {
			case 1: addMember(); break;
			case 2: deleteMember(); break;
			case 3: listMember(); break;
			case 4: updateMember(); break;
			default: System.out.println("error!");
			}
		}
		System.out.println("����");
	}
	int select() {
		System.out.println("1:�߰� 2:���� 3:����Ʈ 4:���� 0:����");
		int answer = sc.nextInt();
		sc.nextLine();
		return answer;
	}
	void addMember() {
		System.out.print("ȸ�� �̸� : ");
		String name = sc.next();
		System.out.print("ȸ�� �ּ� : ");
		String address = sc.next();
		System.out.print("ȸ�� ����ó : ");
		String tel = sc.next();
		Member member = new Member(name, address, tel);
		members.add(member);
		System.out.println(member.toString() + " �߰��Ϸ�");
	}
	void deleteMember() {
		System.out.println("������ ȸ�� �̸�");
		String name = sc.next();
		Member member = Find(name);
		System.out.println(member);
		if (member == null) {
			System.out.println("�������� �ʽ��ϴ�.");
			return;
		}
		members.remove(member);
		System.out.println("�����Ϸ�");
	}
	void listMember() {
		System.out.println("��� ���");
		int cnt = members.size();
		for(Member member : members) {
			System.out.println(member.toString());
		}
	}
	
	void updateMember() {
		
		System.out.println("���� ȸ�� �̸�");
		String name = sc.next();
		
		Member member = Find(name);
		System.out.println("���� ȸ������ : "+member);
		System.out.println("���� �� ȸ�� �̸�");
		name = sc.next();
		System.out.println("���� �� ȸ�� �ּ�");
		String address = sc.next();
		System.out.println("���� �� ȸ�� ����ó");
		String tel = sc.next();
		if (member == null) {
			System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
			return;
		}
		members.remove(member);
		Update(name, address, tel);
		System.out.println("�����Ǿ����ϴ�.");
		
	}
	Member Find(String name) {
		int cnt = members.size();
		for (Member member : members) {
			System.out.println(member.name);
			System.out.println(name);
			if (member.name.equals(name)) {
				return member;
			}
		}
		return null;
	}
	
	Member Update(String name, String address, String tel) {
		Member member = new Member(name, address, tel);
		members.add(member);
		return null;
	}
}
