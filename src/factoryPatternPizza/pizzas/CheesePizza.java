package factoryPatternPizza.pizzas;
import factoryPatternPizza.PizzaIngredientFactory;
import factoryPatternPizza.ingredients.*;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory f) {
		factory = f;
	}
	
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = factory.createDough();
		sauce = factory.createSauce();
		cheese = factory.createCheese();
	}

}
