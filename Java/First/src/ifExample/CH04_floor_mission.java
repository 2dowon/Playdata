package ifExample;

import java.util.Scanner;

public class CH04_floor_mission {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ǹ��� ������ ���ڷ� �Է��ϼ��� : ");
		int floor_num = scan.nextInt();

		String[] floor = new String[floor_num];
		
		for (int i = 0; i < floor.length; i++) {
			System.out.printf((i+1) + "���� ������ ���� �����ּ���. : ");
			floor[i] =scan.next();
		}
		
//		��� ���� ������ �� ����ϰ� ���� ��
//		for (int i = 0; i < floor.length; i++) {
//			System.out.println((i+1) + "���� ������ " + floor[i] + "�Դϴ�.");
//		}
		
		System.out.print("���ϴ� �� ������ �Է��ϼ���. : ");
	    Scanner scan_f = new Scanner(System.in);
	    int floors = scan_f.nextInt();
	    
	    System.out.println(floors + "���� " + floor[floors-1] + "�Դϴ�.");
	    
	    scan.close();

	}

}