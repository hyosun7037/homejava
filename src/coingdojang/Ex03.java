package coingdojang;

import java.util.Scanner;

//입력(Scanner) : 총건수(m), 한 페이지에 보여줄 게시물수(n) (단 n은 1보다 크거나 같다. n>=1)
//출력 : 총 페이지수
//m나누기 n 값 올림으로 출력

public class Ex03 {

	public static void main(String[] args) {
		
		int m, n, total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("게시물 건수 입력");
		m = input.nextInt();
		
		System.out.println("한 페이지에 보여줄 게시물 수");
		n = input.nextInt();
			if(m%n==0) {
				System.out.printf("페이지 수 : "+ m/n);
			}else {
				System.out.printf("페이지 수 : "+ (m/n)+1);
			}
		
	
	}

}
