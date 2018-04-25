package factoryPatternPizza.pizzas;

public class ChicagoStyleVeggiePizza extends Pizza {
	
	public ChicagoStyleVeggiePizza() {
		name = "Chicago Style Sauce and Vegetable Pizza";
		dough = "thick crust dough";
		sauce = "tomato sauce";
		
		toppings.add("mushrooms");
		toppings.add("olives");
		toppings.add("onions");
		toppings.add("spinach");
	}
	
}
