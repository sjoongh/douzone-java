package day26_jdbc_gui.quiz.ex1;
 
public class Prob1 {
	public static void main(String[] args) {
		int seconds = 47567;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
		
		seconds = 11578;
		System.out.println("<< " + seconds + " 초 변환 시간 >>");
		System.out.println(printTime(seconds));
	}

	private static String printTime(int seconds) {
		// 구현하세요.
		int min = seconds / 60;
        int hour = min / 60;
        seconds = seconds % 60;
        min = min % 60;
		return hour+"시 "+min+"분 "+seconds+"초";
	}
}