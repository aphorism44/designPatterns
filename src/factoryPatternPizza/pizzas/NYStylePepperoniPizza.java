package factoryPatternPizza.pizzas;

public class NYStylePepperoniPizza extends Pizza {
	
	public NYStylePepperoniPizza() {
		name = "NY Style Sauce and Pepporoni Pizza";
		dough = "thin crust dough";
		sauce = "marinara sauce";
		
		toppings.add("pepperoni");
	}
	
}
