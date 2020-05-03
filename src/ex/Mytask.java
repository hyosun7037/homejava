package ex;

import java.util.TimerTask;

public class Mytask extends TimerTask{
	@Override
	public void run() {
		System.out.println("타이머 호출");
	}
}
