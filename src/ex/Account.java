package ex;

public class Account {
	int balance = 1000;
	public void withdraw(int money) {
		if(balance >= money) { //�ܰ� > ã�� �ݾ�
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
				balance -= money;
			}
		}
	}




