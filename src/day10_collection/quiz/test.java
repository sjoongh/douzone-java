package day10_collection.quiz;

public class test {
	String name;
	int one, two, three;
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOne() {
		return one;
	}

	public void setOne(int one) {
		this.one = one;
	}

	public int getTwo() {
		return two;
	}

	public void setTwo(int two) {
		this.two = two;
	}

	public int getThree() {
		return three;
	}

	public void setThree(int three) {
		this.three = three;
	}

	public static int total(String[] name, int one, int two, int three) {
		int total = 0;
		
		total = one+two+three;
		
		return total;
	}
}
