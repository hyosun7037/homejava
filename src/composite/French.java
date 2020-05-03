package composite;

import lombok.Data;

@Data
public class French {
	private int price;
	private String desc;
	
	public French() {
		this(2000,"감자튀김");
	}
	
	public French(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "이 만들어졌습니다.");
	}
	
	

}
