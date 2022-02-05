package day07_oop.quiz;

public class test3 {
	public test3(double avg) {
		String grade = null;
		
		switch((int) avg) {
		case 100:
			grade = "A+";
			break;
		case 90:
			grade = "A";
			break;
		case 80:
			grade = "B";
			break;
		case 70:
			grade = "C";
			break;
		case 60:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		
		return grade;
	}
}
