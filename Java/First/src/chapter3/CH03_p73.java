package chapter3;

public class CH03_p73 {

	public static void main(String[] args) {
		System.out.println("이지스 리조트 방 배정 시스템");
		
		int STUDENT = 30;
		
		for (int i = 1; i <= STUDENT; i++) {
			int ROOM_NUMBER = i % 10;
			System.out.println(i + "번은 " + ROOM_NUMBER + "번 방 입니다.");
			}
	}

}
