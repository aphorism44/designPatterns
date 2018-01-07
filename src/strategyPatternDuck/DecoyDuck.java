package strategyPatternDuck;

public class DecoyDuck extends Duck {
	
	public DecoyDuck(String n) {
		super(n);
		this.setQuackBehavior(new MuteQuack());
		this.setFlyBehavior(new FlyNoWay());
	}
	
	public void display() {
		System.out.println("it looks like a wooden decoy");
	}
	
}