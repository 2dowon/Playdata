package ifExample;

import java.util.Scanner;

public class SwitchCase_season {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���ڷ� �Է��ϼ��� : ");
		
		int month;
		month = scan.nextInt();
		
		String season = "";
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			scan.close();
			break;
		
		case 3:
		case 4:
		case 5:
			season = "��";
			scan.close();
			break;
		
		case 6:
		case 7:
		case 8:
			season = "����";
			scan.close();
			break;
			
		case 9:
		case 10:
		case 11:
			season = "����";
			scan.close();
			break;
		}
		System.out.printf("%d���� ������ %s �Դϴ�.", month, season);
		
	}

}
