package coingdojang;

//�̿ϼ� - ��� ���� 0.0���� ����

import java.util.Scanner;

//�������� ��Ź ��ü�� �޺� ���ߵ���
//���� ū ��Ź�� �������� ���
public class Ex06 {

	double a, b, c;
	
	public Ex06() {
		
		if(a<1000000d || b<1000000d || c<1000000d) {
			System.out.println("ù��° ���� ���̸� �Է�");
			Scanner a = new Scanner(System.in);
			a.nextDouble();			
			
			System.out.println("�ι�° ���� ���̸� �Է�");
			Scanner b = new Scanner(System.in);
			b.nextDouble();
			
			System.out.println("����° ���� ���̸� �Է�");
			Scanner c = new Scanner(System.in);
			c.nextDouble();
		}
		
		double s = (a+b+c)/2;
		double r = Math.sqrt(s*(s-a)*(s-b)*(s-c))/s;
		
		System.out.println
		("The radius of the rond table is : " + Math.round(r*1000)/1000d);
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

}
