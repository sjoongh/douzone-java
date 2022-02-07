package day08_oop.ex07.Enum;

// enum ������ - ���ο� Ŭ���� Ÿ���� �����ϴ� ��

enum UserStatus {
	PENDING,
	ACTIVE,
	INACTIVE,
	DELETE;
}

enum Day {
	SUNDAY, MONDAY, TUESDAY
}

public class MainEntry {
	
	// 3.
	Day day; // ������ ���� ����
	
	public MainEntry(Day day) {
		this.day = day;
	}
	
	public void tells() {
		switch(day) {
		case SUNDAY:
			break;
		
		default:
			break;
		} 
		
	}
	public static void main(String[] args) {
		// 1.
		System.out.println(UserStatus.ACTIVE);
		System.out.println("-----------------------");
		// 2.
		for (UserStatus status: UserStatus.values()) {
			System.out.println(status);
		}
		
		Day day; // ������ ���� ����
		
	}
}
