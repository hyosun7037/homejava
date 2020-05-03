package ch04;

import java.util.Scanner;

//너비와 높이 입력받아 사각형의 합을 구하는 프로그램

class Rectangle{
	int width, height;
	
	public int getArea() {
		return width*height;
	}
}
public class RectApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle(); // 클래스 호출
		rect.width = sc.nextInt();// 입력값 저장
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 넓이 : " + rect.getArea());
		
	}

}
