package ex;
//�������� �迭 ����
public class SkewdArray {

	public static void main(String[] args) {
		int arr[][] = new int[4][]; //�� ���� ���۷��� �迭
		arr[0] = new int[3]; // ù°���� ���� 3�� �迭
		arr[1] = new int[2]; // ��°���� ���� 2�� �迭
		arr[2] = new int[3]; // ��°���� ���� 3�� �迭
		arr[3] = new int[2]; // ��°���� ���� 2�� �迭
		
		for (int i = 0; i < arr.length; i++) { //�࿡ ���� �ݺ�
			for (int j = 0; j < arr[i].length; j++) { //���� ���� �ݺ�
				arr[i][j] = (i+1) * 10 + j;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");	
			}
			System.out.println();//�����ٷ� �Ѿ��
		}
		
	}

}


