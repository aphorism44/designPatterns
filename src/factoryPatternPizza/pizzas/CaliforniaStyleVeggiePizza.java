package factoryPatternPizza.pizzas;

public class CaliforniaStyleVeggiePizza extends Pizza {
	
	public CaliforniaStyleVeggiePizza() {
		name = "NY Style Sauce and Vegetable Pizza";
		dough = "thin crust dough";
		sauce = "marinara sauce";
		
		toppings.add("kale");
		toppings.add("olives");
		toppings.add("onions");
		toppings.add("spinach");
	}
	
}
