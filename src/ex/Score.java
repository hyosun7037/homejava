package ex;

//2���� �迭�� 1,2�б� ���� ����, 4�Ⱓ ��ü ��� ���� ���
public class Score {

	public static void main(String[] args) {
		double score[][] = {{1,2},{1,2},{1,2},{1,2}};
		int n = score.length;
		int m = score[0].length;
		double sum = 0;
		for (int year = 0; year < score.length; year++) {
			for (int term = 0; term < score[term].length; term++) {
				sum += score[year][term];
			}
		}
		System.out.println("��� : " + sum/(m*n));
	}

}


