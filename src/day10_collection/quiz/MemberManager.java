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
		System.out.println("종료");
	}
	int select() {
		System.out.println("1:추가 2:삭제 3:리스트 4:수정 0:종료");
		int answer = sc.nextInt();
		sc.nextLine();
		return answer;
	}
	void addMember() {
		System.out.print("회원 이름 : ");
		String name = sc.next();
		System.out.print("회원 주소 : ");
		String address = sc.next();
		System.out.print("회원 연락처 : ");
		String tel = sc.next();
		Member member = new Member(name, address, tel);
		members.add(member);
		System.out.println(member.toString() + " 추가완료");
	}
	void deleteMember() {
		System.out.println("삭제할 회원 이름");
		String name = sc.next();
		Member member = Find(name);
		System.out.println(member);
		if (member == null) {
			System.out.println("존재하지 않습니다.");
			return;
		}
		members.remove(member);
		System.out.println("삭제완료");
	}
	void listMember() {
		System.out.println("멤버 목록");
		int cnt = members.size();
		for(Member member : members) {
			System.out.println(member.toString());
		}
	}
	
	void updateMember() {
		
		System.out.println("수정 회원 이름");
		String name = sc.next();
		
		Member member = Find(name);
		System.out.println("수정 회원정보 : "+member);
		System.out.println("수정 될 회원 이름");
		name = sc.next();
		System.out.println("수정 될 회원 주소");
		String address = sc.next();
		System.out.println("수정 될 회원 연락처");
		String tel = sc.next();
		if (member == null) {
			System.out.println("수정할 회원이 존재하지 않습니다.");
			return;
		}
		members.remove(member);
		Update(name, address, tel);
		System.out.println("수정되었습니다.");
		
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
