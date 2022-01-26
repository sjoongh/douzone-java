package ex02.operator;
// 최단산쉬관논삼대콤
public class MainEntry {
	public static void Main(String[] args) {
		// 관계연산자 : >, <, >=, <=, ==(같다), !=(같지않다)
		
		int x = 2, y = 20;
		
		if (x != y)
			System.out.println("같지 않습니다.");
		else
			System.out.println("같습니다.");
		
		// 삼항연산자 :(조건)? 참 : 거짓
		String msg = null; // msg =""
		msg = (x != y) ? "같지 않습니다" : "같습니다.";
		System.out.println(msg);
		
		int a = 10, b = 20, c = 30, result;
		
		result = (a > b) ? a : (b > c) ? a = (b < c) ;
		System.out.println(result);
		
	// 1. shift 연산자 : <<, >>, <<<, >>>
//	int x = 8, result;
	
//	result = x << 2; // left shift : 원래값 * 2 ^ bit 수
//	result = x >> 3; // right shift : 원래값 / 2 ^ bit 수
	
//	System.out.println("left shift" + result); // 32
//	System.out.println("right shift" + result); // 1
	
	}
}
