package ifExample;

import java.util.Scanner;

public class CH04_floor_mission2 {

	public static void main(String[] args) {
		System.out.print("�ǹ��� ������ ���ڷ� �Է��ϼ��� : ");	// �迭 ���� ���� �ȳ� �޽���
		
		Scanner scan1 = new Scanner(System.in); 		// ����ڿ��� �迭���� ���� �Է� ����
		int floor_count;								// ����ڿ��� ���� ���� �����ϴ� ����
		floor_count = scan1.nextInt();					// ����ڿ��� ���� ���� ������ ����
		
		String[] name = new String[floor_count]; 		// name�� �迭���� ������ ����
		
		System.out.println("�� ���� ���� ������ �Է��ϼ���. ex) �౹ ����(�� �� ���) �����ܰ�"); // 1�� �౹, 2�� �����ܰ�
		Scanner scan2 = new Scanner(System.in);

//		System.out.println(floor_count); // �Էµ� ���� �� ���Դ��� Ȯ���ϴ� ��ɾ�
		
		for (int i = 0; i < floor_count; i++) {
			name[i] = scan2.nextLine();
		}
		
		
		for (int i = 0; i < floor_count; i++) {
			System.out.println("���� ���� ���� ������ " + (i+1) + "�� : " + name[i]);
		}
		
		scan1.close();
		scan2.close();
		
	}

}