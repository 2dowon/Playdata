package ifExample;

import java.util.Scanner;

public class CH04_floor_mission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("건물의 층수를 숫자로 입력하세요 : ");
		int floor_num = scan.nextInt();

		String[] floor = new String[floor_num];
		
		for (int i = 0; i < floor.length; i++) {
			System.out.printf((i+1) + "층의 업종에 대해 적어주세요. : ");
			floor[i] =scan.next();
		}
		
//		모든 층의 정보를 다 출력하고 싶을 때
//		for (int i = 0; i < floor.length; i++) {
//			System.out.println((i+1) + "층의 업종은 " + floor[i] + "입니다.");
//		}
		
		System.out.print("원하는 층 정보를 입력하세요. : ");
	    Scanner scan_f = new Scanner(System.in);
	    int floors = scan_f.nextInt();
	    
	    System.out.println(floors + "층은 " + floor[floors-1] + "입니다.");
	    
	    scan.close();

	}

}