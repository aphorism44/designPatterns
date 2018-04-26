package factoryPatternPizza;

import factoryPatternPizza.pizzas.*;

public class CaliforniaStylePizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new CaliforniaPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(factory);
			pizza.setName("California Style Cheese Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(factory);
			pizza.setName("California Style Pepperoni Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(factory);
			pizza.setName("California Style Clam Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(factory);
			pizza.setName("California Style Veggie Pizza");
		}
		
		return pizza;
	}

}
