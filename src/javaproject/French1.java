package javaproject;

public class French1{
	private int price;
	private String desc;
	
	public French1() {
		this(2000,"����Ƣ��");
	}
	
	public French1(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}
	
	
	
}
