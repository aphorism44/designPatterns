package decoratorPatternCoffee;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage b) {
		this.beverage = b;
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}
	
	public double cost() {
		return this.beverage.cost() + 0.20;
	}
	
}
