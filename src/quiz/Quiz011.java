package quiz;

import java.util.Scanner;

//�Ʒ� �迭�� 20���� �ʱ�ȭ
//for�� �̿�, 20���� 1���� �Է��ϰ� ���ٷ� ���
public class Quiz011 {

	public static void main(String[] args) {
		int a [] = new int[20];
		System.out.println("20���� 1���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			System.out.print(a[i]);
		}
	}

}
