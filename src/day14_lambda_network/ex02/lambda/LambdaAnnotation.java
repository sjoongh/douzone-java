package day14_lambda_network.ex02.lambda;

@FunctionalInterface
interface Plus {
	int sum(int x, int y);
}

public class LambdaAnnotation {

	public static void main(String[] args) {
		
		
		Plus plus = (int x, int y) -> x+y;
		System.out.println(plus.sum(3, 5));
	}

}
