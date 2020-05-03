package ex;

public class Account {
	int balance = 1000;
	public void withdraw(int money) {
		if(balance >= money) { //잔고 > 찾는 금액
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
				balance -= money;
			}
		}
	}




