package quiz;

import java.util.Scanner;

//Ÿ�̸� ����
//���ڸ� �Է��ϸ� ī��Ʈ ���, ī��Ʈ �Ϸ�� "����"��� �����Ѵ�.
//1�� ������ �ִ� �ڵ�� Thread.sleep(1000)
public class Quiz016 extends Thread {
	
	@Override
	public void run() {
		int count = 0;
		System.out.println("���ڸ� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i+ " ");
			} catch (Exception e) {
				System.out.print("�����带 �����մϴ�."); //���ᰡ �ȳ���
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		Quiz016 qq = new Quiz016();
		qq.start();
//		new Quiz016().run();
		
		
		
		
		
		

	}

}
