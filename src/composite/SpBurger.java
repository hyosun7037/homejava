package composite;

public class SpBurger extends Burger{
	public SpBurger() {
		super(5000,"쉬림프버거");
	}
	
	public SpBurger(int price, String desc) {
		super(price, desc);
		System.out.println("-----------> 쉬림프 버거 세트 하나요");
	}
}
