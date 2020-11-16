package loopexample;

import java.util.Scanner;

public class Continue_gender {

	public static void main(String[] args) {
		String[] jumin = {"2011116-1234567", "2011116-2345678", "2011117-1234567", "2011117-2345678", "2011118-1234567", "2011118-2345678", "2011119-1234567", "2011119-2345678"};
		int male_count = 0;
		int female_count = 0;

		for (i = 0; i <= jumin.length; i++) {
			char ch = jumin[i].charAt(7);
			if ((int) ch % 2 == 1) {
				male_count = male_count + 1;
			} else {
				female_count = female_count + 1;
			}
		}

		System.out.println("남성 :" + male_count + "명, 여성 : " + female_count);
	}

}
