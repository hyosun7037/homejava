package composite;

public class SpBurger extends Burger{
	public SpBurger() {
		super(5000,"����������");
	}
	
	public SpBurger(int price, String desc) {
		super(price, desc);
		System.out.println("-----------> ������ ���� ��Ʈ �ϳ���");
	}
}
