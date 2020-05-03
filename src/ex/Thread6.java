package ex;

public class Thread6 {

	public static void main(String[] args) {
		Bank t1 = new Bank("ATM");
		Bank t2 = new Bank("АєЗа");
		
		t1.start();
		t2.start();
	}

}
