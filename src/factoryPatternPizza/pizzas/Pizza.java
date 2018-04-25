package factoryPatternPizza.pizzas;

import java.util.ArrayList;

//product CLASS (ABSTRACT), PARALLEL WITH CREATOR CLASSES
public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing " + dough + " dough");
		System.out.println("Adding " + sauce + " sauce");
		System.out.println("Adding toppings:");
		for (String t: toppings)
			System.out.println("\t" + t);
	}
	
	public void bake() {
		System.out.println("Baking for 25 minutes at 325.");
	}
	public void cut() {
		System.out.println("Cutting into diagonal slices.");
	}
	public void box() {
		System.out.println("Placing in cardboard box.");
	}
	
	public String getName() {
		return name;
	}
	
	
	
	
}
