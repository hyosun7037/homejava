package ex;

public class ThreadInterrupt extends Thread{
	public ThreadInterrupt(String str) {
		super(str);
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(getName() + i + "번쨰 수행");
			} catch (InterruptedException e) {
				System.out.println("스레드 강제 종료");
				return;
			}
			
		}
	}
}

