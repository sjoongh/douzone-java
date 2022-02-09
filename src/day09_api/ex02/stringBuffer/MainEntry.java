package day09_api.ex02.stringBuffer;

public class MainEntry {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); // ó�� �ڸ��� �޸� �ּҿ� ���� ����
		
		System.out.println(sb.hashCode()); // 36671642
		
		System.out.println("length	/	capacity");
		int len = sb.length();	int size = sb.capacity();
		System.out.println(len + "	/	"+size);
		
		sb.append("happyvirus");
		len = sb.length();	size = sb.capacity();
		System.out.println(len + "	/	" + size); // 10 / 16 -> capacity�뷮 : 16�� (*2��ŭ �þ�� + null���� ũ�� 2)
		
		sb.append("12345 67890");
		System.out.println(sb.length() + "	/	"+sb.capacity()); // 21 / 34
		
		sb.append("sfisk erwei 67890 ");
		System.out.println(sb.length() + " / "+sb.capacity()); // 39 / 70
		
		System.out.println(sb.hashCode());
		
		System.out.println(sb);
		sb.trimToSize(); // ����ũ�⸸ŭ�� �뷮 ũ�� ����
		System.out.println(sb.length() + " / "+sb.capacity()); // 39 / 39
	}

}
