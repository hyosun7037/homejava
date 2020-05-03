package ex;

public class Thread2 {
	public static void main(String[] args) {
		Runnable obj1 = new RunnableTest();
		Runnable obj2 = new RunnableTest();
		
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		
//		th1.start();
//		th2.start();
		
		th1.run();
		th2.run();
	}
}

