package day08_oop.quiz;

public class MainEntry {

	public static void main(String[] args) {
		Trans[] t = new Trans[4];
		
		Object[] trans = { new Biclycle(), new Bus(), new Plain(), new Subway() };
		for (int i = 0; i < t.length; i++) {
			t[i] = (Trans)trans[i];
		}
		
		String[] name = {"Biclycle","Bus","Plain","Subway"};
		
		for (int i = 0; i < t.length; i++) {
			t[i].start(true, name[i]);
			t[i].stop(false, name[i]);
		}
		
	}

}
