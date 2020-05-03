package ch04;
//Grade 클래스 작성, 3과목의 점수를 입력받아 Grade 객체 생성, 성적 출력

import java.util.Scanner;

class Score{
	int a, b, c;

	public Score(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void out() {
		System.out.println(" 수학점수 : " + a + " 영어점수 : " + b + " 국어점수: " + c);
	}
}

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 입력받기
		int m = sc.nextInt();
		int e= sc.nextInt();
		int c = sc.nextInt();
		Score s = new Score(m, e, c);
		
		s.out();
		
		
		
	}

}
