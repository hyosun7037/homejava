
//스레드 실행
package ex;

public class ThreadTest extends Thread{ //1번 방법 : 스레드 상속
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(500); //0.5초동안 대기
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

