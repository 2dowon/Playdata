package chapter4;

import java.util.Scanner;

public class if_school {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���̸� ���ڷ� �Է��ϼ��� : ");
		
		int age;
		age = scan.nextInt();
		
        if (age < 8) {
        	System.out.println(age + "����" + " �б��� �ٴ��� �ʽ��ϴ�.");
        	scan.close();
        }
        else if ((age >= 8) && (age < 14)) {
        	System.out.println(age + "����" + " �ʵ��б��� �ٴմϴ�.");
        	scan.close();
        }
        else if ((age >= 14) && (age < 17)) {
        	System.out.println(age + "����" + " ���б��� �ٴմϴ�.");
        	scan.close();
        }
        else if ((age >= 17) && (age < 20)) {
        	System.out.println(age + "����" + " ����б��� �ٴմϴ�.");
        	scan.close();
        }
        else {
        	System.out.println(age + "����" + " ���б��� �ٴմϴ�.");
        	scan.close();
        }
        
	}

}
