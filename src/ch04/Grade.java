package ch04;
//Grade Ŭ���� �ۼ�, 3������ ������ �Է¹޾� Grade ��ü ����, ���� ���

import java.util.Scanner;

class Score{
	int a, b, c;

	public Score(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void out() {
		System.out.println(" �������� : " + a + " �������� : " + b + " ��������: " + c);
	}
}

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // �Է¹ޱ�
		int m = sc.nextInt();
		int e= sc.nextInt();
		int c = sc.nextInt();
		Score s = new Score(m, e, c);
		
		s.out();
		
		
		
	}

}
