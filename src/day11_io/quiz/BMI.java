package day11_io.quiz;

public class BMI {
	private String name;
	private double weight;
	private double height;
	private double bmi;
	private int ch;
	
	public BMI(String name, double weight, double height, double bmi, int ch) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmi = bmi;
		this.ch = ch;
	}
	
	public BMI(double weightli, double heightli) {
		this.weight = weightli;
		this.height = heightli;
	}
	

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
}
