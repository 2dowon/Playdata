package loopexample;

public class WhileExample1 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while (num <= 10) {
			sum = sum + num;
			num = num + 1;
		}
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}

}
