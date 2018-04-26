package factoryPatternPizza;

import factoryPatternPizza.ingredients.*;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Vegetable[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClams();
	
}
