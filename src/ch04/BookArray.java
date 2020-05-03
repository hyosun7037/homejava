package ch04;

import java.util.Scanner;

//Book클래스 활용, 2개짜리 Book 객체배열 생성, 사용자로부터 책의 제목과 저자를 입력받아 배열 완성하기

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2]; //2개짜리 Book 객체 배열 생성
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < book.length; i++) { //2개
			System.out.print("제목 >> ");
			String t = sc.nextLine(); //입력값 저장
			System.out.print("저자 >> ");
			String a = sc.nextLine(); 
			book[i] = new Book(t, a);
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + "," + book[i].author + ")");
			
			sc.close();
		}
	}

}
