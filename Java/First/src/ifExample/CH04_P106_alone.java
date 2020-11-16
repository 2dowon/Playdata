package ifExample;

import java.util.Scanner;

public class CH04_P106_alone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("가시는 층의 숫자로 입력하세요 : ");
		
		int floor = scan.nextInt();
		
		String[] floor_info = {"약국", "정형외과", "피부과", "치과", "헬스 클럽"};
		
		switch(floor) {
		case 1:
			System.out.println(floor + "층 " + floor_info[0] + "입니다.");
			scan.close();
			break;
		case 2:
			System.out.println(floor + "층 " + floor_info[1] + "입니다.");
			scan.close();
			break;
		case 3:
			System.out.println(floor + "층 " + floor_info[2] + "입니다.");
			scan.close();
			break;
		case 4:
			System.out.println(floor + "층 " + floor_info[3] + "입니다.");
			scan.close();
			break;
		case 5:
			System.out.println(floor + "층 " + floor_info[4] + "입니다.");
			scan.close();
			break;
		}
	}
}
