package quiz;

import java.util.Scanner;

//아래 배열을 20개로 초기화
//for문 이용, 20에서 1까지 입력하고 한줄로 출력
public class Quiz011 {

	public static void main(String[] args) {
		int a [] = new int[20];
		System.out.println("20부터 1까지 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.print(a[i]);
		}
	}

}
