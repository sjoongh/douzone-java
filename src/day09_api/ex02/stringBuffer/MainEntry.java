package day09_api.ex02.stringBuffer;

public class MainEntry {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // 처음 자리한 메모리 주소에 값이 잡힘
		
		System.out.println(sb.hashCode()); // 36671642
		
		System.out.println("length	/	capacity");
		int len = sb.length();	int size = sb.capacity();
		System.out.println(len + "	/	"+size);
		
		sb.append("happyvirus");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "	/	" + size); // 10 / 16 -> capacity용량 : 16의 (*2만큼 늘어나고 + null문자 크기 2)
		
		sb.append("12345 67890");
		System.out.println(sb.length() + "	/	"+sb.capacity()); // 21 / 34
		
		sb.append("sfisk erwei 67890 ");
		System.out.println(sb.length() + " / "+sb.capacity()); // 39 / 70
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		sb.trimToSize(); // 글지크기만큼만 용량 크기 조정
		System.out.println(sb.length() + " / "+sb.capacity()); // 39 / 39
	}

}
