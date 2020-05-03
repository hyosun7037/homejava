package ch03;

import java.util.Scanner;

//�ҹ��� ���ĺ� �ϳ� �Է¹ް�, ���ʴ�� ��� (������ ����)
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��ϼ���");
		String s = sc.next(); //Char X, String���� ���� �ް� ���ڸ��� �����ϸ� ��
		
		if(s.length() != 1) {
			System.out.println("���ĺ� �ϳ��� �Է��ϼ���");
			sc.close();
			return;
		}
		
		char c = s.charAt(0); //ù��° ���ڸ� ������ ����
		if(c<'a' || c>'z') {
			System.out.println("���ĺ��� �ƴմϴ�.");
			sc.close();
			return;
		}
		
		for (char i = c; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
