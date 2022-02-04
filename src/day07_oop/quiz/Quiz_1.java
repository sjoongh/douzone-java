package day07_oop.quiz;
/*
  tv class : 채널, 색상, 소리
 */
public class Quiz_1 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setChannel(7);
		tv.setColor("red");
		tv.setVolume(10);
		tv.outPut();
	}
}
