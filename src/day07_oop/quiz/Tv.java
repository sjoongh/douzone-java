package day07_oop.quiz;

public class Tv {
	int channel;
	String color;
	int volume;

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void outPut() {
		System.out.println("channel : "+this.channel+" color : "+this.color+" volume : "+this.volume);
	}
	
}
