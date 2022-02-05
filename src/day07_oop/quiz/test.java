package day07_oop.quiz;

public class test extends Quiz_Score {
	
	public test(String name, int total) {
		System.out.println("===============================================================================================================");
		System.out.print("¿Ã ∏ß : "+this.name+" | ");
		System.out.print("√— ¡° : "+this.total+" | ");
		System.out.printf("∆Ú ±’ : %.2f¡° | ", average(this.total));
		System.out.print("«– ¡° : "+grade(average(this.total))+" | ");
		System.out.println();
	}
}
