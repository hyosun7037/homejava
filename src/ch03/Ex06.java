package ch03;

import java.util.Scanner;

//�׼��Է¹ް�, 1��~ 5�������� �� ��� ��ȯ�Ǵ��� ��� (1,10,100~)
public class Ex06 {
	
	public Ex06() { //������
		int [] unit = {50000,10000,1000,500,100,10,1};// �迭�� ���� ����
		System.out.println("�ݾ��� �Է��Ͻÿ�");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); //�Է¹��� �� �ҷ�����

		for (int i = 0; i < unit.length; i++) {
			int res = m/unit[i]; //res�� ��

			if(res>0) {
				System.out.println(unit[i] + "��¥��" + res + "��");
				m = m%unit[i];
			}
		}
	}
	public static void main(String[] args) {
		new Ex06(); // ������ ȣ��
	}

}
