package ifExample;

import java.util.Scanner;

public class CH04_P106_alone2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� ���ڷ� �Է��ϼ��� : ");
		
		int floor;
		floor = scan.nextInt();
		
		String place_name = "";
		
		switch(floor) {
		case 1:
			place_name = "�౹";
			scan.close();
			break;
		case 2:
			place_name = "�����ܰ�";
			scan.close();
			break;
		case 3:
			place_name = "�Ǻΰ�";
			scan.close();
			break;
		case 4:
			place_name = "ġ��";
			scan.close();
			break;
		case 5:
			place_name = "�ｺ Ŭ��";
			scan.close();
			break;
		}
		System.out.printf("%d�� %s�Դϴ�.", floor, place_name);
	}
}
