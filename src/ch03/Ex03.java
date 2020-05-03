package ch03;

import java.util.Scanner;

//scanner를 이용하여 정수 입력, *출력하는 프로그램
public class Ex03 {
	
	private int star;
	
	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt(); // 변수에 담을 때 앞에 타입 붙이기!
		
		if(num<=0) {
			System.out.println("0보다 큰수를 입력하세요");
			sc.close();
			return;
		} // 예외처리
		
		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	public static void main(String[] args) {
	new Ex03();
	}

}
