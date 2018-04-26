package factoryPatternPizza.pizzas;

import factoryPatternPizza.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	
	PizzaIngredientFactory factory;
	
	public ClamPizza(PizzaIngredientFactory f) {
		factory = f;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		clam = factory.createClams();
	}

}
