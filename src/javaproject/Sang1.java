package javaproject;

class ����{
	int num = 1;
	
	public int ����() {
		return num;
	}
	
}

class ī��� extends ����{
	int num = 3;
	
	public int ����() {
		return num;
	}
	
}

class �Ƹ޸�ī�� extends ����{
	int num = 4;
	
	public int ����() {
		return num;
	}
	
}

public class Sang1 {

	static void test(���� ff1, ���� ff2) {
		System.out.println(ff1.num + " " + ff2.num);
		System.out.println(ff1.����() + "�� �����" + ff2.����() + "�� ����");
	}
	
	public static void main(String[] args) {
//		���� f1 = new ����();
//		System.out.println("����Ÿ���� ���Ļ����ڴ� num��" + f1.num);
//		System.out.println(f1.����() + "\n");
//		
//		Ŀ�� f2 = new �Ƹ޸�ī��();
//		System.out.println("����Ÿ���� ���Ļ����ڴ� num��" + f2.num);
//		System.out.println(f2.����() + "\n");
//		
//		���� f3 = new �Ƹ޸�ī��();
//		System.out.println("����Ÿ���� ���Ļ����ڴ� num��" + f3.num);
//		System.out.println(f3.����() + "\n");
		
		
		�Ƹ޸�ī�� f1 = new �Ƹ޸�ī��();
		ī��� f2 = new ī���();
		
		test(f1,f2);
		
	}

}
