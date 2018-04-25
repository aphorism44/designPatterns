package factoryPatternPizza;

import factoryPatternPizza.pizzas.*;


//CREATOR CLASS (ABSTRACT), PARALLEL WITH PRODUCT CLASSES

public abstract class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = this.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
	
}
