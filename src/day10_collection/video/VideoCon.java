package day10_collection.video;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class VideoCon  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Video> video = new HashMap<String, Video>();
		
		Scanner sc = new Scanner(System.in);
		
		Video tmp = null;
		int cnt = 0;
		
		while (true) {
			System.out.println("1. 비디오 정보 추가 | 2. 비디오 정보 수정 | 3. 비디오 삭제 | 4. 대여정보 출력 | 0. 종료");
			cnt = sc.nextInt();
			switch(cnt) {
			case 1:
				tmp = new Video();
				System.out.println("비디오 제목은?");
				tmp.title = sc.next();

				System.out.println("비디오 장르는?");
				tmp.category = sc.next();
				
				System.out.println("비디오 대여여부?");
				tmp.bil = sc.next();
				video.put(tmp.title, tmp);
				break;
			case 2:
				System.out.println("수정할 비디오 제목");
				String fixtitle = sc.next();
				
				tmp = video.get(fixtitle);
				if (tmp == null) {
					System.out.println("그런 비디오는 없습니다.");
					break;
				}
				
				System.out.println("비디오 제목은?");
				tmp.title = sc.next();

				System.out.println("비디오 장르는?");
				tmp.category = sc.next();
				
				System.out.println("비디오 대여여부?");
				tmp.bil = sc.next();
				System.out.println("변경되었습니다.");
				video.put(tmp.title, tmp);
				break;
			case 3:
				System.out.println("삭제할 비디오 제목");
				String deltitle = sc.next();
				video.remove(deltitle);
				System.out.println("삭제되었습니다.");
				break;
			case 4:
				Set keys = video.keySet();
				Iterator<String> it = keys.iterator();
				
				while (it.hasNext()) {
					tmp = video.get(it.next());
					System.out.println(tmp.title+" | 대여여부 : "+tmp.bil);
					break;
				}
				break;
			default:
				System.exit(0);
			}
			
		}
	}

}
