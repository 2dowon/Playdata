package chapter4;

import java.util.Scanner;

public class if_gender {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("�ֹε�Ϲ�ȣ 13�ڸ��� �Է��ϼ��� : ");
//
//		String input = scan.next();
//		char[] rnn = input.toCharArray(); // rnn = Resident Registration Number �ֹε�Ϲ�ȣ
//
//		if (rnn[6] % 2 == 0) {
//			System.out.println("����� �����Դϴ�.");
//		} else {
//			System.out.println("����� �����Դϴ�.");
//		}
//
//		scan.close();

		String jumin = "", gender = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("����� �ֹε�Ϲ�ȣ��?(-�� �����ؼ� �Է�)");
		jumin = scan.next();

		char ch = jumin.charAt(7);
		if ((int) ch % 2 == 1) {
			gender = "����";
		} else {
			gender = "����";
		}
		System.out.println("����:" + gender);
	}

}
