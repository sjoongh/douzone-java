package day06_method_oop.quiz;


class Test {
	private String name, pos, depart, sal, hp;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public void outPut() {
		System.out.println(name+"\t"+pos+"\t"+depart+"\t"+sal+"\t"+hp);
	}
	
	
	
}

public class test {
	public static void main(String[] args) {
		// 이름, 직급, 부서, 급여, 연락처
		// setter / getter method
		// output method
		Test test = new Test();
		
		test.setDepart("coder");
		test.setHp("01012345678");
		test.setName("nick");
		test.setPos("Seoul");
		test.setSal("3000");
	}


}
