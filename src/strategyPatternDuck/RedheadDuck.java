package strategyPatternDuck;

public class RedheadDuck extends Duck {
	
	public RedheadDuck(String n) {
		super(n);
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	public void display() {
		System.out.println("it looks like a Redhead");
	}
	
}