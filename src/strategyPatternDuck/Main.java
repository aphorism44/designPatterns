package strategyPatternDuck;

public class Main {

	public static void main(String [] args) {
		
		MallardDuck mal = new MallardDuck("charlie");
		RedheadDuck red = new RedheadDuck("richard");
		RubberDuck rub = new RubberDuck("jackie");
		DecoyDuck dec = new DecoyDuck("fake");
		ModelDuck mod = new ModelDuck("rocketman");
		
		mal.performFly();
		mal.performQuack();
		mal.display();
		
		red.performFly();
		red.performQuack();
		red.display();
		
		rub.performFly();
		rub.performQuack();
		rub.display();
		
		dec.performFly();
		dec.performQuack();
		dec.display();
		
		mod.performFly();
		mod.performQuack();
		mod.display();
		mod.setFlyBehavior(new FlyNoWay());
		mod.performFly();
		
	}
	
}
