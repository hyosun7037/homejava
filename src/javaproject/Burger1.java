package javaproject;

public class Burger1 {
	private int price; //���� ����
	private String desc;
	
	
	public Burger1() {
		this(1500,"�⺻����");
	}
	
	public Burger1(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}
	

}
