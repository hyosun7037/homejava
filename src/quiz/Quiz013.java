package quiz;

import java.util.Scanner;

public class Quiz013 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("0보다 작습니다.");
		}else if(a<10) {
			System.out.println("10보다 작습니다.");
		}else {
			System.out.println("10이상 입니다.");
		}

	}

}
