package ex;

public class PriorityTest extends Thread{
	
	public PriorityTest(String str) {
		//생성자
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(getName() + i + "번째 수행");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
