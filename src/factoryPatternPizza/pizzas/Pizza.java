package factoryPatternPizza.pizzas;
import factoryPatternPizza.ingredients.*;

import java.util.ArrayList;

//product CLASS (ABSTRACT), PARALLEL WITH CREATOR CLASSES
public abstract class Pizza {
	String name;
	
	Dough dough;
	Sauce sauce;
	Vegetable[] veggies;
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Baking for 25 minutes at 325.");
	}
	public void cut() {
		System.out.println("Cutting into diagonal slices.");
	}
	public void box() {
		System.out.println("Placing in cardboard box.");
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
	
	
	
	
}
