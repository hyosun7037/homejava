package ex;

//2차원 배열로 1,2학기 성적 저장, 4년간 전체 평균 평점 출력
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
		System.out.println("평균 : " + sum/(m*n));
	}

}


