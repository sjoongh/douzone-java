package day08_oop.ex08.api;

class Circle {
	int x,y;
}

public class EqualsMain {

	public static void main(String[] args) {
		// class 호출마다 메모리상에 새로운 영역을 차지함
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		System.out.println("c1 : "+c1.hashCode());
		System.out.println("c2 : "+c2.hashCode());
		
		int x = 3, y = 3; // 기본자료형은 실제 값인 3이 메모리상에 들어가있음
		System.out.println("기본 자료형 비교");
		if (x == y) System.out.println("같다");
		else System.out.println("다르다");
		

		System.out.println("참조 자료형 비교");
		String str1 = new String("kosa"); // 참조자료형은 실제값이 메모리주소를 가르키고있음
		String str2 = new String("kosa"); 
		
		if (str1 == str2) System.out.println("같다");
		else System.out.println("다르다");
		
		// 해결방법 : equals()
		System.out.println("********* equals() method비교 *******");
//		if (str1.equals(str2)) System.out.println("같다"); // 대소문자 구분o
		if (str1.equalsIgnoreCase(str2)) System.out.println("같다"); // 대소문자 구분x
		else System.out.println("다르다");
	}

}
