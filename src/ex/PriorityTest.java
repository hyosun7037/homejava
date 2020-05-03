package ex;

public class PriorityTest extends Thread{
	
	public PriorityTest(String str) {
		//������
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(getName() + i + "��° ����");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
