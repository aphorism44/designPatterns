package factoryPatternPizza;

import factoryPatternPizza.pizzas.*;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(factory);
			pizza.setName("New York Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName("New York Style Veggie Pizza");
		}
		
		return pizza;
	}

}
