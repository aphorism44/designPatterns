package strategyPatternDuck;


public class Duck {
	
	protected String name;
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck(String n) {
		this.name = n;
	}
	
	public void setFlyBehavior(FlyBehavior f) {
		this.flyBehavior = f;
	}
	
	public void setQuackBehavior(QuackBehavior q) {
		this.quackBehavior = q;
	}
	
	
	protected void performFly() {
		flyBehavior.fly();
	}
	
	protected void performQuack() {
		quackBehavior.quack();
	}
	
	protected void swim() {
		System.out.println("dive, splash, swim");
	}
	
	protected void display() {}
	
}

