package decoratorPatternCoffee;

public class SteamedMilk extends CondimentDecorator {

	Beverage beverage;
	
	public SteamedMilk(Beverage b) {
		this.beverage = b;
	}
	
	public String getDescription() {
		return this.beverage.getDescription() + ", Steamed Milk";
	}
	
	public double cost() {
		return this.beverage.cost() + 0.10;
	}
	
}
