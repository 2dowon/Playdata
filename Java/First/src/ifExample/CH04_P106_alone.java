package ifExample;

import java.util.Scanner;

public class CH04_P106_alone {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���ô� ���� ���ڷ� �Է��ϼ��� : ");
		
		int floor = scan.nextInt();
		
		String[] floor_info = {"�౹", "�����ܰ�", "�Ǻΰ�", "ġ��", "�ｺ Ŭ��"};
		
		switch(floor) {
		case 1:
			System.out.println(floor + "�� " + floor_info[0] + "�Դϴ�.");
			scan.close();
			break;
		case 2:
			System.out.println(floor + "�� " + floor_info[1] + "�Դϴ�.");
			scan.close();
			break;
		case 3:
			System.out.println(floor + "�� " + floor_info[2] + "�Դϴ�.");
			scan.close();
			break;
		case 4:
			System.out.println(floor + "�� " + floor_info[3] + "�Դϴ�.");
			scan.close();
			break;
		case 5:
			System.out.println(floor + "�� " + floor_info[4] + "�Դϴ�.");
			scan.close();
			break;
		}
	}
}
