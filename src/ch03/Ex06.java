package ch03;

import java.util.Scanner;

//액수입력받고, 1원~ 5만원까지 각 몇개로 반환되는지 출력 (1,10,100~)
public class Ex06 {
	
	public Ex06() { //생성자
		int [] unit = {50000,10000,1000,500,100,10,1};// 배열에 원소 저장
		System.out.println("금액을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); //입력받은 값 불러오기

		for (int i = 0; i < unit.length; i++) {
			int res = m/unit[i]; //res는 몫

			if(res>0) {
				System.out.println(unit[i] + "원짜리" + res + "개");
				m = m%unit[i];
			}
		}
	}
	public static void main(String[] args) {
		new Ex06(); // 생성자 호출
	}

}
