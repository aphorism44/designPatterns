package factoryPatternPizza;

import factoryPatternPizza.pizzas.*;

public class ChicagoStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(factory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName("Chicago Style Veggie Pizza");
		}
		
		return pizza;
	}

}
