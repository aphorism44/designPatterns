package strategyPatternDuck;

public class MuteQuack implements QuackBehavior {
	
	public void quack() {
		System.out.println("no sounds");
	}
	
}
