package ex;

public class Thread5 {

	public static void main(String[] args) {
		ThreadInterrupt th = new ThreadInterrupt("������");
		th.start();
		
		//3�ʿ� ���ͷ�Ʈ
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		th.interrupt();
	}

}
