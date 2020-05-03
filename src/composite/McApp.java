package composite;


public class McApp {

	public static void main(String[] args) {
		BigBurgerSet set1 = new BigBurgerSet();
		
		Burger burger1 = new Burger();
		
		Coke coke1 = new Coke();
		
		BigBurgerSet set2 = new BigBurgerSet(new BigBurger(3000,"빅버거할인"), new Coke(), new French());
		System.out.println(set1.getBigBurger().getPrice());
		System.out.println(set2.getBigBurger().getPrice());
		
		BigBurgerSet set3 = new BigBurgerSet(new BigBurger(2000,"빅버거할인"));
		
		Spset set4 = new Spset();

	}

}
