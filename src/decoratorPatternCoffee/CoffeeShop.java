package decoratorPatternCoffee;

public class CoffeeShop {
	
	
	public static void main(String args[]) {
		Beverage b1 = new Espresso();
		System.out.println(b1.getDescription() + " $ " + b1.cost());	
		
		Beverage b2 = new DarkRoast();
		b2 = new Mocha(b2);
		b2 = new Mocha(b2);
		b2 = new Whip(b2);
		
		System.out.println(b2.getDescription() + " $ " + b2.cost());
		
		Beverage b3 = new HouseBlend();
		b3 = new Soy(b2);
		b3 = new Mocha(b2);
		b3 = new Whip(b2);
		
		System.out.println(b3.getDescription() + " $ " + b3.cost());
		
	}
}
