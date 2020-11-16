package loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		int i;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			sum = sum + i;
		}
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
		
	}

}
