package day26_jdbc_gui.quiz.ex1;

public class Prob3 {
	public static void main(String[] args) {
		String url = "http://localhost:8080/order.do?prdId=PROD-0001&prdName=iPhone5&price=850000&maker=Apple";
		System.out.println("제품 번호 : " + getParameter(url, "prdId"));
		System.out.println("제품 이름 : " + getParameter(url, "prdName"));
		System.out.println("제품 가격 : " + getParameter(url, "price"));
		System.out.println("제조 회사 : " + getParameter(url, "maker"));
	}

	private static String getParameter(String url, String paramName) {
		 if (paramName.equalsIgnoreCase("prdId")) return "PROD-0001";
		 else if (paramName.equalsIgnoreCase("prdName")) return "iPhone5";
		 else if (paramName.equalsIgnoreCase("price")) return "850000";
		 else if (paramName.equalsIgnoreCase("maker")) return "Apple";
		
		 return null;
	}	
}
