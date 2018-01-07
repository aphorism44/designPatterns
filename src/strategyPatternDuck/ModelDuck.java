package strategyPatternDuck;

public class ModelDuck extends Duck {
	
	public ModelDuck(String n) {
		super(n);
		this.setQuackBehavior(new MuteQuack());
		this.setFlyBehavior(new FlyRocketPowered());
	}

	public void display() {
		System.out.println("it looks like a model duck");
	}
	
}