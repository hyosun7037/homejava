package ex;

public class Thread4 {

	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest("�켱 ������ ���� ������");
		PriorityTest t2 = new PriorityTest("�켱 ������ ���� ������");
		t1.setPriority(Thread.MIN_PRIORITY); //�ּ� �켱����
		t2.setPriority(Thread.MAX_PRIORITY ); //�ִ� �켱����\
		
		t1.start();
		t2.start();
	}

}
