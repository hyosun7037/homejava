package ch03;

import java.util.Scanner;

//���� ���� 10���� �Է¹޾� �迭�� ����, �迭�� �ִ� ���� �� 3�� ����� ����ϴ� ���α׷�
public class Ex05 {

	public Ex05() {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("10���� ���� ������ �Է��ϼ���");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("3�� �����");
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
