package ifExample;

import java.util.Scanner;

public class SwitchCase_season {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 숫자로 입력하세요 : ");
		
		int month;
		month = scan.nextInt();
		
		String season = "";
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "겨울";
			scan.close();
			break;
		
		case 3:
		case 4:
		case 5:
			season = "봄";
			scan.close();
			break;
		
		case 6:
		case 7:
		case 8:
			season = "여름";
			scan.close();
			break;
			
		case 9:
		case 10:
		case 11:
			season = "가을";
			scan.close();
			break;
		}
		System.out.printf("%d월의 계절은 %s 입니다.", month, season);
		
	}

}
