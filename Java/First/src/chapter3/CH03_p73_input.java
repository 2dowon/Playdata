package chapter3;
import java.util.Scanner;

public class CH03_p73_input {

	public static void main(String[] args) {
		
		System.out.println("������ ����Ʈ �� ���� �ý���");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
		
		int number;
		number = scan.nextInt();
		System.out.println("���� " + number + "�� �Դϴ�." + "��� ������ ���� �ϳ���?");
		
        int room_number = number % 10;

		System.out.println(room_number + "�� ������ ������.");
        
        scan.close();
	}
}