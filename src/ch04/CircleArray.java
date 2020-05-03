package ch04;

class Circle2{
	int radius;

	public Circle2(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius * radius;
	}
	
}
public class CircleArray {

	public static void main(String[] args) {
		Circle2 [] c; //Circle 배열에 대한 레퍼런스 C 선언
		c = new Circle2[5]; //5개의 레퍼런스 배열 생성
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle2(i);
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println((int)c[i].getArea() + " ");
		}
	}

}
