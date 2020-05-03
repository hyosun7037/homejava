package ex;

public class ThreadTest2 {

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
//		//동시에 실행
//		t1.start();
//		t2.start();
		
		//번갈아가면서 실행
		t1.run();
		t2.run();
	}

}
