package study;

import say.Say;

//class Say {
//
//	static void hello() { // main�� �ƴ� �Լ��� �־ ���������� �������� ���ϴ� �ڵ� : ���
//		System.out.println("�ȳ��ϼ���");
//
//	}

public class Function1 {

	public static void main(String[] args) { //main�� ���ԵǾ� �־� ������ ������ �ڵ� : ���α׷�
		System.out.println("�ȳ��ϼ���");
		Say.hello(); 
		// ���� ���� ���� �ִ� ����� ȣ���ϴ� ��� : Ŭ����.�޼���()
		// ��Ű���� ������ �ٸ� ���Ϸ� ������ ���� ��쿡�� ȣ���� �����ϴ�.
		
		// ��Ű���� �ƿ� �ٸ� ��� : ����� �� Ŭ������ ��ɵ��� public���� �ۼ�, import�� ȣ��
		new Say();
	}

}
