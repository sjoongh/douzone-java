package day11_io.quiz;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class datas {
	
	Scanner sc = new Scanner(System.in);
	
	public void newbmi(ArrayList<BMI> tmpBMI) {
		String name;
		double bmi = 0;
		double weight;
		double height;
		int ch;
		int test = 0;
		
		boolean run = false;
		
			System.out.print("이름을 입력하세요 : ");
			name = sc.next();
			
			System.out.println("당신의 몸무게는?");
			weight = sc.nextInt();
			System.out.println("당신의 키는?");
			height = sc.nextInt();
			System.out.println("당신의 성별은? 1=남자, 2=여자");
			ch = sc.nextInt();
			if (ch == 1) { // 남자일때
				bmi = weight / ((height / 100.0) * (height / 100.0));
				height = (height-100) * 0.9;
				tmpBMI.add(new BMI(name, weight, height, bmi, ch));
			} else if (ch == 2) { // 여자일때
				bmi = weight / ((height / 100.0) * (height / 100.0));
				height = (height-100) * 0.85;
				tmpBMI.add(new BMI(name, weight, height, bmi, ch));
			} else {
				System.out.println("error!");
			}
			System.out.println(choice(bmi));
	}
	public String choice(double bmi) {
		if (bmi < 18.5) {
			return "체중부족";
		} else if ((bmi > 18.5) && (bmi < 22.9)) {
			return "정상";
		} else if ((bmi > 23.0) && (bmi < 24.9)) {
			return "과체중";
		} else if (bmi > 25.0) {
			return "비만";
		}
		return null;
	}
	
	public void create(ArrayList<BMI> tmpBMI) {
		int cnt = 0;
		int cnt2 = 0;
		
		try {
			FileWriter fw = new FileWriter("c:/my/test.txt", false);
			
			while(tmpBMI.size() > cnt) {
				fw.write(tmpBMI.get(cnt).getName()+"\r\n");
				fw.write(tmpBMI.get(cnt).getWeight()+"\r\n");
				fw.write(tmpBMI.get(cnt).getHeight()+"\r\n");
				fw.write("\r\n");
				cnt++;
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("에러");
			cnt2+=1;
		}
		if (cnt2 == 0) {
			System.out.println("파일 저장 성공");
		} else {
			System.out.println("파일 저장 실패");
		}
	}
	
	public void delete (ArrayList<BMI> tmpBMI) {
		String name;
		boolean run = false;
		int find;
		
		try {
			System.out.print("삭제할 이름 : ");
			name = sc.next();
			for (int i = 0; i < tmpBMI.size(); i++) {
				if (tmpBMI.get(i).getName().equals(name)) {
					find = i;
					tmpBMI.remove(i);
					
					run = true;
					System.out.println("삭제 되었습니다.");
				}
			}
			if (run == false) {
				System.out.println("찾지 못했습니다.");
			}
		} catch (Exception e) {
			System.out.println("에러");
		}
	}
	
	public void update(ArrayList<BMI> tmpBMI) {
		boolean run = false;
		int find;
		String findname;
		String name;
		int wei;
		double hei;
		int ch;
		double bmi;
		
		try {
			System.out.print("찾을 이름은? : ");
			findname = sc.next();
			for (int i = 0; i < tmpBMI.size(); i++) {
				if (tmpBMI.get(i).getName().equals(findname)) {
					find = i;
					System.out.print("새로운 이름 입력 : ");
					name = sc.next();
					System.out.print("새로운 몸무게 입력 : ");
					wei = sc.nextInt();
					System.out.print("새로운 키 입력 : ");
					hei = sc.nextInt();
					
					if (tmpBMI.get(i).isCh() == 1) {
							bmi = wei / ((hei / 100.0) * (hei / 100.0));
							hei = (hei-100) * 0.9;
							tmpBMI.set(find, new BMI(name, wei, hei, bmi, 1));
						} 
					else if (tmpBMI.get(i).isCh() == 2) { // 여자일때
							bmi = wei / ((hei / 100.0) * (hei / 100.0));
							hei = (hei-100) * 0.85;
							tmpBMI.set(find, new BMI(name, wei, hei, bmi, 2));
						}
					run = true;				
				}
			}
			if (run == false) {
				System.out.println("error!");
			}
		} catch (Exception e) {
			System.out.println("error@@!@");
		}
	}
	
	public void openFile(ArrayList<BMI> FileBMI) {
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("c:/my/test.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (Exception e) {
			System.out.println("메모장이 없습니다.");
		}
	}
	

	
}
