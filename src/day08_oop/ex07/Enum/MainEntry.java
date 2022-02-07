package day08_oop.ex07.Enum;

// enum 열거형 - 새로운 클래스 타입을 정의하는 것

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
	Day day; // 열거형 변수 선언
	
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
		
		Day day; // 열거형 변수 선언
		
	}
}
