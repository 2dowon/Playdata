package chapter3;
import java.util.Scanner;

public class CH03_p73_input {

	public static void main(String[] args) {
		
		System.out.println("이지스 리조트 방 배정 시스템");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 번호를 입력하세요 : ");
		
		int number;
		number = scan.nextInt();
		System.out.println("저는 " + number + "번 입니다." + "어느 방으로 가야 하나요?");
		
        int room_number = number % 10;

		System.out.println(room_number + "번 방으로 가세요.");
        
        scan.close();
	}
}