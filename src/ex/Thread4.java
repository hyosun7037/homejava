package ex;

public class Thread4 {

	public static void main(String[] args) {
		PriorityTest t1 = new PriorityTest("우선 순위가 낮은 스레드");
		PriorityTest t2 = new PriorityTest("우선 순위가 높은 스레드");
		t1.setPriority(Thread.MIN_PRIORITY); //최소 우선순위
		t2.setPriority(Thread.MAX_PRIORITY ); //최대 우선순위\
		
		t1.start();
		t2.start();
	}

}
