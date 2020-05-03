package ch03;

import java.util.Scanner;

//소문자 알파벳 하나 입력받고, 차례대로 출력 (별찍기와 유사)
public class Ex04 {
	
	public Ex04() {
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 알파벳 하나를 입력하세요");
		String s = sc.next(); //Char X, String으로 저장 받고 앞자리만 추출하면 됨
		
		if(s.length() != 1) {
			System.out.println("알파벳 하나만 입력하세요");
			sc.close();
			return;
		}
		
		char c = s.charAt(0); //첫번째 문자만 가지고 오기
		if(c<'a' || c>'z') {
			System.out.println("알파벳이 아닙니다.");
			sc.close();
			return;
		}
		
		for (char i = c; i >= 'a'; i--) {
			for (char j = 'a'; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		sc.close();
	
	}
	
	public static void main(String[] args) {
		new Ex04();
	}

}
