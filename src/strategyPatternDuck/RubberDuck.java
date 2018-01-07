package strategyPatternDuck;

public class RubberDuck extends Duck {
	
	public RubberDuck(String n) {
		super(n);
		this.setQuackBehavior(new Squeak());
		this.setFlyBehavior(new FlyNoWay());
	}
	
	public void display() {
		System.out.println("it looks like a rubber ducky");
	}
	
}