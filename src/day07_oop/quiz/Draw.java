package day07_oop.quiz;

public class Draw {
	// 필드 선언
	protected int w, h;
	protected double result;
	
	// 생성사 함수
	public Draw() { w = h = 0; result = 0; }
	
	public Draw(int w, int h, double result) {
		this.w = w;
		this.h = h;
	}
	
	public Draw(int w) {
		this.w = w;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getResult() {
		return result;
	}
	
	public double calc() {
		return result;
	}

	@Override
	public String toString() {
		return "Draw [w=" + w + ", h=" + h + ", result=" + result + "]";
	}
	
	public void show() {
		System.out.println(w + ", " + h);
	}
	
}
