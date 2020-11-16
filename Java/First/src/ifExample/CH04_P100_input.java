package ifExample;

import java.util.Scanner;

public class CH04_P100_input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 숫자로 입력하세요 : ");
		
		int score;
		score = scan.nextInt();
		
		char grade;
		
		if (90 <= score && score <= 100) {
			grade = 'A';
			scan.close();
		}
		
		else if (score >= 80) {
			grade = 'B';
			scan.close();
		}
		
		else if (score >= 70) {
			grade = 'C';
			scan.close();
		}
		
		else if (score >= 60) {
			grade = 'D';
			scan.close();
		}
		
		else {
			grade = 'F';
			scan.close();
		}
		
		System.out.println("당신의 학점은 " + grade + " 입니다.");
	}

}
