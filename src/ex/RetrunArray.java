// ���� 4�� ������ ������ �迭 ����, 1,2,3,4�� �ʱ�ȭ
// �迭 �����ϴ� makeArray()
// �޼ҵ�κ��� �迭 ���޹޾� �� ����ϴ� ���α׷�

package ex;

public class RetrunArray {

	static int[] makeArray() {
		int temp[] = new int[4];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i+1; // �迭 ���� 1,2,3,4 �ʱ�ȭ
		}
		return temp;

	}
	
	public static void main(String[] args) {

	int arr[]; //�迭 ���۷��� ���� ����
	arr = makeArray(); //�޼ҵ�κ��� �迭 ���� ����
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}

	}

}
