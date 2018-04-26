package factoryPatternPizza;

import factoryPatternPizza.ingredients.*;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ExtraThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new BruschettaSauce();
	}

	@Override
	public Cheese createCheese() {
		return new GoatCheese();
	}

	@Override
	public Vegetable[] createVeggies() {
		Vegetable[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClams() {
		return new Calamari();
	}

}
