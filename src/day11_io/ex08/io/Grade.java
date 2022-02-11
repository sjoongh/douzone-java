package day11_io.ex08.io;

public class Grade {
	private int score;
	private String subject;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "Grade [score=" + score + ", subject=" + subject + "]";
	}
	
}
