package coingdojang;

//�⺻ �˰��� ����
//1000�̸��� �ڿ��� (for���̳� while�� ���)
//3,5�� ����� ���� (if�� ���)
//����(sum)

//1000�̸��� �ڿ������� 3,5�� ����� ������ ���϶�

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if(i%3==0 || i%5==0) {
				sum +=i;
				System.out.println(sum);
			}
		}
	}

}
