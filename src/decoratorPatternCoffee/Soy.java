package decoratorPatternCoffee;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage b) {
		this.beverage = b;
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}
	
	public double cost() {
		return this.beverage.cost() + 0.15;
	}
	
}
