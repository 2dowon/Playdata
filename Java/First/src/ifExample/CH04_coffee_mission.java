package ifExample;

import java.util.Scanner;

public class CH04_coffee_mission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하시는 커피 메뉴를 입력하세요 (아메리카노, 카페라떼, 핫초코) : ");
		
		String coffee = scan.next();
		int americano_count = 0;
		int latte_count = 0;
		int choco_count = 0;
		
		switch(coffee) {
		case "아메리카노" :
			break;
		case "카페라떼' :
			break;
		case "핫초코" :
			break;
		default :
			break;
		}
		
	}

}
