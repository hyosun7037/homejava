package javaproject;

public class Coke1 {
	private int price;
	private String desc;
	
	public Coke1() {
		this(1500,"��ī�ݶ�");
	}

	public Coke1(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "�� ����������ϴ�.");
	}
	
}
