package ex;

public class ThreadTest2 {

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
//		//���ÿ� ����
//		t1.start();
//		t2.start();
		
		//�����ư��鼭 ����
		t1.run();
		t2.run();
	}

}
