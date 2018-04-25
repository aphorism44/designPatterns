package factoryPatternPizza.pizzas;

public class NYStyleVeggiePizza extends Pizza {
	
	public NYStyleVeggiePizza() {
		name = "NY Style Sauce and Vegetable Pizza";
		dough = "thin crust dough";
		sauce = "marinara sauce";
		
		toppings.add("mushrooms");
		toppings.add("olives");
		toppings.add("onions");
		toppings.add("spinach");
	}
	
}
