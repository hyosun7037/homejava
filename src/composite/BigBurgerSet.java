package composite;

import lombok.Data;

@Data
public class BigBurgerSet {
	private BigBurger bigBurger;
	private Coke coke;
	private French french;
	
	public BigBurgerSet() {
		this(new BigBurger(), new Coke(), new French());
	}
	
	public BigBurgerSet(BigBurger bigBurger) {
		this(bigBurger, new Coke(), new French());
	}

	public BigBurgerSet(BigBurger bigBurger, Coke coke, French french) {
		this.bigBurger = bigBurger;
		this.coke = coke;
		this.french = french;
		System.out.println("---------->빅버거 세트 하나요");
	}
}
