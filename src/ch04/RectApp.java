package ch04;

import java.util.Scanner;

//�ʺ�� ���� �Է¹޾� �簢���� ���� ���ϴ� ���α׷�

class Rectangle{
	int width, height;
	
	public int getArea() {
		return width*height;
	}
}
public class RectApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle(); // Ŭ���� ȣ��
		rect.width = sc.nextInt();// �Է°� ����
		rect.height = sc.nextInt();
		
		System.out.println("�簢���� ���� : " + rect.getArea());
		
	}

}
