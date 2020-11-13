package chapter4;

import java.util.Scanner;

public class if_gender {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("주민등록번호 13자리를 입력하세요 : ");

		String input = scan.next();
        char[] rnn = input.toCharArray(); // rnn =  Resident Registration Number 주민등록번호
		
		if (rnn[6] % 2 == 0) {
			System.out.println("당신은 여자입니다.");
		}
		else {
			System.out.println("당신은 남자입니다.");
		}
		
		scan.close();
	}

}
