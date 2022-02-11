package day10_collection.score;

public class Score {
	private String name;
	private int kor;
	private int eng;
	private int com;
	private int tot;
	private double avg;
	private char grade;
	
	public Score(String name, int kor, int eng, int com) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.com = com;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}
	
	public int total(int kor, int eng, int com) {
		tot = kor+eng+com;
		return tot;
	}
	
	public double avg(int tot) {
		avg = tot/3.0;
		return avg;
	}
	
	public char grade(double avg) {
		switch ( (int)avg / 10) {
		case 10:
		case 9: return 'A';
		case 8: return 'B';
		case 7: return 'B';
		case 6: return 'B';
		default: return 'F';
		}
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", com=" + com + ", tot=" + total(kor,eng,com) + ", avg="
				+ avg(tot) + ", grade=" + grade(avg(tot)) + "]";
	}
	
	
}
