package ex;

import java.util.Timer;

public class TimerTest {

	public static void main(String[] args) {
		Mytask task = new Mytask();
		Timer timer = new Timer();
		
		timer.schedule(task, 1000, 500);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			timer.cancel();
		}
		timer.cancel();
	}

}
