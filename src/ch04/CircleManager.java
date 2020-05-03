package ch04;

import java.util.Scanner;

class Circle1{
	private double x,y;
	private int radius;
	
	public Circle1(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius; // x,y, radius 초기화
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
	
}
public class CircleManager {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle1 c [] = new Circle1[3];//3개의 Circle 배열 선언
		for (int i = 0; i < c.length; i++) {
			System.out.println("x, y, radius >>");
			double x = sc.nextDouble();//x값
			double y = sc.nextDouble();//y값
			int radius = sc.nextInt(); //radius
			c[i]= new Circle1(x,y,radius);//Circle 객체 생성
		}
		for (int i = 0; i < c.length; i++) {
			c[i].show();
			sc.close();
		}
	}

}
