package ch03;

import java.util.Scanner;

//양의 정수 10개를 입력받아 배열에 저장, 배열에 있는 정수 중 3의 배수만 출력하는 프로그램
public class Ex05 {

	public Ex05() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("10개의 양의 정수를 입력하세요");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("3의 배수는");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

}
