package javaproject;

class 음료{
	int num = 1;
	
	public int 섭취() {
		return num;
	}
	
}

class 카페라떼 extends 음료{
	int num = 3;
	
	public int 섭취() {
		return num;
	}
	
}

class 아메리카노 extends 음료{
	int num = 4;
	
	public int 섭취() {
		return num;
	}
	
}

public class Sang1 {

	static void test(음료 ff1, 음료 ff2) {
		System.out.println(ff1.num + " " + ff2.num);
		System.out.println(ff1.섭취() + "번 음료와" + ff2.섭취() + "번 음료");
	}
	
	public static void main(String[] args) {
//		음식 f1 = new 음식();
//		System.out.println("음식타입의 음식생성자는 num값" + f1.num);
//		System.out.println(f1.섭취() + "\n");
//		
//		커피 f2 = new 아메리카노();
//		System.out.println("음식타입의 음식생성자는 num값" + f2.num);
//		System.out.println(f2.섭취() + "\n");
//		
//		음식 f3 = new 아메리카노();
//		System.out.println("음식타입의 음식생성자는 num값" + f3.num);
//		System.out.println(f3.섭취() + "\n");
		
		
		아메리카노 f1 = new 아메리카노();
		카페라떼 f2 = new 카페라떼();
		
		test(f1,f2);
		
	}

}
