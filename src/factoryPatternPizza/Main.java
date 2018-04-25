package factoryPatternPizza;

import factoryPatternPizza.pizzas.*;

public class Main {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYStylePizzaStore();
		PizzaStore chiStore = new ChicagoStylePizzaStore();
		
		Pizza p1 = nyStore.orderPizza("cheese");
		Pizza p2 = chiStore.orderPizza("veggie");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());

	}

}
