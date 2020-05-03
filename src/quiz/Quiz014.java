package quiz;

import java.util.Scanner;

public class Quiz014 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
			while(true) {
				System.out.print("안녕하세요" + " ");
				count++;
				if(a==count) {
					break;
				}

		}
	}

}
