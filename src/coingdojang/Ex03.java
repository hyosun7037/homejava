package coingdojang;

import java.util.Scanner;

//�Է�(Scanner) : �ѰǼ�(m), �� �������� ������ �Խù���(n) (�� n�� 1���� ũ�ų� ����. n>=1)
//��� : �� ��������
//m������ n �� �ø����� ���

public class Ex03 {

	public static void main(String[] args) {
		
		int m, n, total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�Խù� �Ǽ� �Է�");
		m = input.nextInt();
		
		System.out.println("�� �������� ������ �Խù� ��");
		n = input.nextInt();
			if(m%n==0) {
				System.out.printf("������ �� : "+ m/n);
			}else {
				System.out.printf("������ �� : "+ (m/n)+1);
			}
		
	
	}

}
