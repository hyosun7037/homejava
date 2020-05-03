package javaproject;

public class French1{
	private int price;
	private String desc;
	
	public French1() {
		this(2000,"감자튀김");
	}
	
	public French1(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "이 만들어졌습니다.");
	}
	
	
	
}
