package ifExample;

import java.util.Scanner;

public class CH04_floor_mission2 {

	public static void main(String[] args) {
		System.out.print("건물의 층수를 숫자로 입력하세요 : ");	// 배열 방의 갯수 안내 메시지
		
		Scanner scan1 = new Scanner(System.in); 		// 사용자에게 배열방의 갯수 입력 받음
		int floor_count;								// 사용자에게 받은 값을 저장하는 변수
		floor_count = scan1.nextInt();					// 사용자에게 받을 값을 실제로 저장
		
		String[] name = new String[floor_count]; 		// name의 배열방의 갯수를 조정
		
		System.out.println("각 층별 입점 정보를 입력하세요. ex) 약국 엔터(한 줄 띄기) 정형외과"); // 1층 약국, 2층 정형외과
		Scanner scan2 = new Scanner(System.in);

//		System.out.println(floor_count); // 입력된 값이 잘 들어왔는지 확인하는 명령어
		
		for (int i = 0; i < floor_count; i++) {
			name[i] = scan2.nextLine();
		}
		
		
		for (int i = 0; i < floor_count; i++) {
			System.out.println("빌딩 층별 입점 정보는 " + (i+1) + "층 : " + name[i]);
		}
		
		scan1.close();
		scan2.close();
		
	}

}