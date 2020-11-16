package ifExample;

import java.util.Scanner;

public class CH04_P106_alone2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("층을 숫자로 입력하세요 : ");
		
		int floor;
		floor = scan.nextInt();
		
		String place_name = "";
		
		switch(floor) {
		case 1:
			place_name = "약국";
			scan.close();
			break;
		case 2:
			place_name = "정형외과";
			scan.close();
			break;
		case 3:
			place_name = "피부과";
			scan.close();
			break;
		case 4:
			place_name = "치과";
			scan.close();
			break;
		case 5:
			place_name = "헬스 클럽";
			scan.close();
			break;
		}
		System.out.printf("%d층 %s입니다.", floor, place_name);
	}
}
