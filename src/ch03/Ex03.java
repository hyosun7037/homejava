package ch03;

import java.util.Scanner;

//scanner�� �̿��Ͽ� ���� �Է�, *����ϴ� ���α׷�
public class Ex03 {
	
	private int star;
	
	public Ex03() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num = sc.nextInt(); // ������ ���� �� �տ� Ÿ�� ���̱�!
		
		if(num<=0) {
			System.out.println("0���� ū���� �Է��ϼ���");
			sc.close();
			return;
		} // ����ó��
		
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
