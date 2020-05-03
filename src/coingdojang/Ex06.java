package coingdojang;

//미완성 - 계속 답이 0.0으로 나옴

import java.util.Scanner;

//정오에는 원탁 전체에 햇빛 비추도록
//가장 큰 원탁의 반지름을 계산
public class Ex06 {

	double a, b, c;
	
	public Ex06() {
		
		if(a<1000000d || b<1000000d || c<1000000d) {
			System.out.println("첫번째 변의 길이를 입력");
			Scanner a = new Scanner(System.in);
			a.nextDouble();			
			
			System.out.println("두번째 변의 길이를 입력");
			Scanner b = new Scanner(System.in);
			b.nextDouble();
			
			System.out.println("세번째 변의 길이를 입력");
			Scanner c = new Scanner(System.in);
			c.nextDouble();
		}
		
		double s = (a+b+c)/2;
		double r = Math.sqrt(s*(s-a)*(s-b)*(s-c))/s;
		
		System.out.println
		("The radius of the rond table is : " + Math.round(r*1000)/1000d);
	}
	
	public static void main(String[] args) {
		new Ex06();
	}

}
