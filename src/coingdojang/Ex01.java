package coingdojang;

//기본 알고리즘 개념
//1000미만의 자연수 (for문이나 while문 사용)
//3,5의 배수의 총합 (if문 사용)
//총합(sum)

//1000미만의 자연수에서 3,5의 배수의 총합을 구하라

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
