
//������ ����
package ex;

public class ThreadTest extends Thread{ //1�� ��� : ������ ���
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500); //0.5�ʵ��� ���
				System.out.println("Thread : " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}
	public static void main(String[] args) {
		new ThreadTest().start();
	}

}

