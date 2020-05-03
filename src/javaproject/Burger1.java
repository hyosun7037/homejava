package javaproject;

public class Burger1 {
	private int price; //변수 선언
	private String desc;
	
	
	public Burger1() {
		this(1500,"기본버거");
	}
	
	public Burger1(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}
	

}
