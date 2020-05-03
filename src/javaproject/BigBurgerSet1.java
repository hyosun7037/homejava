package javaproject;

public class BigBurgerSet1 {
	private BigBurger1 bigBurger1;
	private Coke1 coke1;
	private French1 french1;
	
	public BigBurgerSet1() {
		this(new BigBurger1(), new Coke1(), new French1());
	}

	public BigBurgerSet1(BigBurger1 bigBurger1, Coke1 coke1, French1 french1) {
		this.bigBurger1 = bigBurger1;
		this.coke1 = coke1;
		this.french1 = french1;
	}
	
	public BigBurgerSet1(BigBurger1 bigBurger1) {
		this(bigBurger1, new Coke1(), new French1());
	}

	public BigBurger1 getBigBurger1() {
		return bigBurger1;
	}

	public void setBigBurger1(BigBurger1 bigBurger1) {
		this.bigBurger1 = bigBurger1;
	}

	public Coke1 getCoke1() {
		return coke1;
	}

	public void setCoke1(Coke1 coke1) {
		this.coke1 = coke1;
	}

	public French1 getFrench1() {
		return french1;
	}

	public void setFrench1(French1 french1) {
		this.french1 = french1;
	}
	
	
}
