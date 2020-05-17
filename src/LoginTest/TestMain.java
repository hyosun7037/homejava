package LoginTest;

public class TestMain {
	public static void main(String[] args) {
		TestDB tb = new TestDB();
		Users user = new Users("aa", "1234", "±Ë»øº±", "0105555");
		try {
			tb.insertData(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
