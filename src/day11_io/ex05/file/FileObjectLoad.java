package day11_io.ex05.file;
import java.io.*;

public class FileObjectLoad {
		public static void main(String[] args) throws IOException {
			String name = null;
			String id = null;
			String pwd = null;
			boolean gender = true;
			int age =0;
			String phone = null;
			String temp = null;
			
			File f = new File("members.txt");
			FileInputStream  fis = null;
			ObjectInputStream bis = null;
			
			try {
				fis = new FileInputStream(f);
				bis = new ObjectInputStream(fis);
				
				name = (String)bis.readObject();
				id = (String)bis.readObject();
				pwd = (String)bis.readObject();
				
				gender = (Boolean)bis.readObject();
				age = (Integer)bis.readObject();
				
				phone = (String)bis.readObject();
				
				System.out.println("\t\t\t >> ȸ�� ���� << \n");
				System.out.println("�̸� \t ���̵� \t\t ��й�ȣ \t   ����  \t   ����  \t  ��ȭ��ȣ ");
				System.out.println();
				System.out.print(name + "\t" + id + "\t"+ pwd + "\t");
				if( gender == true ) System.out.print("����");
				else System.out.print("����");
				System.out.println("\t" + age + "\t" + phone);
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				bis.close();
			} // try end
		}
}







