package ch04;

import java.util.Scanner;

//BookŬ���� Ȱ��, 2��¥�� Book ��ü�迭 ����, ����ڷκ��� å�� ����� ���ڸ� �Է¹޾� �迭 �ϼ��ϱ�

public class BookArray {
	public static void main(String[] args) {
		Book [] book = new Book[2]; //2��¥�� Book ��ü �迭 ����
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 0; i < book.length; i++) { //2��
			System.out.print("���� >> ");
			String t = sc.nextLine(); //�Է°� ����
			System.out.print("���� >> ");
			String a = sc.nextLine(); 
			book[i] = new Book(t, a);
		}
		for (int i = 0; i < book.length; i++) {
			System.out.println("(" + book[i].title + "," + book[i].author + ")");
			
			sc.close();
		}
	}

}
