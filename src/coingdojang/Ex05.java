package coingdojang;

//�̿ϼ� - ������ �ߴµ�, ����23������ �𸣰���

import java.util.ArrayList;

//n���� ������ ���� �迭
//���� ������ ���� ���� ��� ������ ����
//���� �� ���� ������ ��, ���� ������ ��
//��� �� : -1, -2, 1, 3, 2
public class Ex05 {

	public Ex05() {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(-1);
		arr.add(1);
		arr.add(3);
		arr.add(-2);
		arr.add(2);
		
		System.out.println("���� �� : " + arr.toString());
		arr.sort(null);
		System.out.println("(��������)���� �� : " + arr.toString());
		
	}
	public static void main(String[] args) {
		new Ex05();
	}

}
