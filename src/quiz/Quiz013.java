package quiz;

import java.util.Scanner;

public class Quiz013 {

	public static void main(String[] args) {
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<0) {
			System.out.println("0���� �۽��ϴ�.");
		}else if(a<10) {
			System.out.println("10���� �۽��ϴ�.");
		}else {
			System.out.println("10�̻� �Դϴ�.");
		}

	}

}
