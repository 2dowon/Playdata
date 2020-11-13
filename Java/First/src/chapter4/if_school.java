package chapter4;

import java.util.Scanner;

public class if_school {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("나이를 숫자로 입력하세요 : ");
		
		int age;
		age = scan.nextInt();
		
        if (age < 8) {
        	System.out.println(age + "살은" + " 학교에 다니지 않습니다.");
        	scan.close();
        }
        else if ((age >= 8) && (age < 14)) {
        	System.out.println(age + "살은" + " 초등학교에 다닙니다.");
        	scan.close();
        }
        else if ((age >= 14) && (age < 17)) {
        	System.out.println(age + "살은" + " 중학교에 다닙니다.");
        	scan.close();
        }
        else if ((age >= 17) && (age < 20)) {
        	System.out.println(age + "살은" + " 고등학교에 다닙니다.");
        	scan.close();
        }
        else {
        	System.out.println(age + "살은" + " 대학교에 다닙니다.");
        	scan.close();
        }
        
	}

}
