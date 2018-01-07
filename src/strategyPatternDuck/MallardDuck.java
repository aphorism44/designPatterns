package strategyPatternDuck;

public class MallardDuck extends Duck {
	
	public MallardDuck(String n) {
		super(n);
		this.setQuackBehavior(new Quack());
		this.setFlyBehavior(new FlyWithWings());
	}

	public void display() {
		System.out.println("it looks like a Mallard");
	}
	
}