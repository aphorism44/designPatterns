package factoryPatternPizza.pizzas;

import factoryPatternPizza.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public PepperoniPizza(PizzaIngredientFactory f) {
		factory = f;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
		pepperoni = factory.createPepperoni();
	}
}
