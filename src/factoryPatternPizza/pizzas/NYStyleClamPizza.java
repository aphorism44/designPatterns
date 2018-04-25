package factoryPatternPizza.pizzas;

public class NYStyleClamPizza extends Pizza {
	
	public NYStyleClamPizza() {
		name = "NY Style Sauce and Clam Pizza";
		dough = "thin crust dough";
		sauce = "marinara sauce";
		
		toppings.add("sliced clams");
	}
	
}
