package ex;

public class RunnableTest implements Runnable{
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("½º·¹µå : " + i);
		}
	}

}
