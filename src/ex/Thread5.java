package ex;

public class Thread5 {

	public static void main(String[] args) {
		ThreadInterrupt th = new ThreadInterrupt("스레드");
		th.start();
		
		//3초에 인터럽트
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		th.interrupt();
	}

}
