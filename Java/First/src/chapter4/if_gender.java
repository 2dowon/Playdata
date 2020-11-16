package chapter4;

import java.util.Scanner;

public class if_gender {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.print("주민등록번호 13자리를 입력하세요 : ");
//
//		String input = scan.next();
//		char[] rnn = input.toCharArray(); // rnn = Resident Registration Number 주민등록번호
//
//		if (rnn[6] % 2 == 0) {
//			System.out.println("당신은 여자입니다.");
//		} else {
//			System.out.println("당신은 남자입니다.");
//		}
//
//		scan.close();

		String jumin = "", gender = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("당신은 주민등록번호는?(-를 포함해서 입력)");
		jumin = scan.next();

		char ch = jumin.charAt(7);
		if ((int) ch % 2 == 1) {
			gender = "남성";
		} else {
			gender = "여성";
		}
		System.out.println("성별:" + gender);
	}

}
